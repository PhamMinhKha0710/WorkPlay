package ex_5;
import java.util.*;

public class demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh thu nhat = ");
        int x = sc.nextInt();
        System.out.print("Nhap canh thu hai = ");
        int y = sc.nextInt();
        System.out.print("Nhap canh thu ba = ");
        int z = sc.nextInt();

        TamGiac h = new TamGiac(x, y, z);
        h.Xuat();
        System.out.print("Loai tam giac: ");
        h.Loai();
        System.out.println("Chu vi = " + h.ChuVi());
        System.out.println("Dien tich = " + h.DienTich());
    }
}