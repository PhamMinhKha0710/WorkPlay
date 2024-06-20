import java.util.Scanner;
public class PhuongTrinhBacNhat {
    private int a, b;

    public PhuongTrinhBacNhat() {
        this.a = 0;
        this.b = 0;
    }

    public PhuongTrinhBacNhat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void giaiPT() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            float x = (float) -b / a;
            System.out.println("Phuong trinh co 1 nghiem x = " + x);
        }
    }
}



public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhuongTrinhBacNhat pt1 = new PhuongTrinhBacNhat();
        System.out.println("Phuong trinh 1:");
        pt1.giaiPT();

        System.out.print("Nhap he so a = ");
        int a = sc.nextInt();
        System.out.print("Nhap he so b = ");
        int b = sc.nextInt();
        PhuongTrinhBacNhat pt2 = new PhuongTrinhBacNhat(a, b);
        System.out.println("Phuong trinh 2:");
        pt2.giaiPT();

        System.out.print("Nhap he so moi cho a = ");
        int newA = sc.nextInt();
        System.out.print("Nhap he so moi cho b = ");
        int newB = sc.nextInt();
        pt2.setA(newA);
        pt2.setB(newB);
        System.out.println("Phuong trinh 2 sau khi thay doi he so:");
        pt2.giaiPT();
    }
}