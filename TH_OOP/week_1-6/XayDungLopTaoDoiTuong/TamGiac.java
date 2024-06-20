import java.util.*;

class TAMGIAC {
    private int a, b, c;

    public TAMGIAC(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void Xuat() {
        System.out.println("Ba canh tam giac: " + a + " " + b + " " + c);
    }

    public int ChuVi() {
        return (a + b + c);
    }

    public float DienTich() {
        float p = (float) (a + b + c) / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void Loai() {
        if (a == b && b == c) {
            System.out.println("Tam giac deu.");
        } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
            System.out.println("Tam giac vuong.");
        } else if (a == b || b == c || a == c) {
            System.out.println("Tam giac can.");
        } else {
            System.out.println("Tam giac thuong.");
        }
    }
}


import java.util.*;

public class Demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh thu nhat = ");
        int x = sc.nextInt();
        System.out.print("Nhap canh thu hai = ");
        int y = sc.nextInt();
        System.out.print("Nhap canh thu ba = ");
        int z = sc.nextInt();

        TAMGIAC h = new TAMGIAC(x, y, z);
        h.Xuat();
        System.out.print("Loai tam giac: ");
        h.Loai();
        System.out.println("Chu vi = " + h.ChuVi());
        System.out.println("Dien tich = " + h.DienTich());
    }
}