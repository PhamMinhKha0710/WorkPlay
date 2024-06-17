package EX_6;

import java.util.Scanner;

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
