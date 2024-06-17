import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sinh vien: ");
        String masv = sc.nextLine();

        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        byte age = sc.nextByte();

        System.out.print("Nhap nam sinh: ");
        int year = sc.nextInt();

        System.out.print("Nhap diem trung binh: ");
        float mark = sc.nextFloat();

        System.out.println("--------");
        System.out.println("MSSV: " + masv);
        System.out.println("Ten: " + hoTen);
        System.out.println("Tuoi: " + age);
        System.out.println("Nam sinh: " + year);
        System.out.println("Diem Trung binh: " + mark);

        sc.close();
    }
}
