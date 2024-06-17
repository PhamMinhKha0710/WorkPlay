package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CuocThiTinHoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ThiSinh> thiSinhList = new ArrayList<>();

        System.out.print("Nhap so luong thi sinh: ");
        int soLuongThiSinh = scanner.nextInt();

        for (int i = 0; i < soLuongThiSinh; i++) {
            System.out.println("Nhap thong tin thi sinh thu " + (i + 1) + ":");
            System.out.print("Nhap loai thi sinh (1: Chuyen, 2: Sieu Cup): ");
            int loaiThiSinh = scanner.nextInt();

            scanner.nextLine();  // Consume newline

            System.out.print("Nhap SBD: ");
            String sbd = scanner.nextLine();
            System.out.print("Nhap ho ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("Nhap diem bai 1: ");
            double bai1 = scanner.nextDouble();
            System.out.print("Nhap diem bai 2: ");
            double bai2 = scanner.nextDouble();
            System.out.print("Nhap diem bai 3: ");
            double bai3 = scanner.nextDouble();

            if (loaiThiSinh == 1) {
                System.out.print("Nhap diem tieng Anh: ");
                double tiengAnh = scanner.nextDouble();
                Chuyen chuyen = new Chuyen(sbd, hoTen, bai1, bai2, bai3, tiengAnh);
                thiSinhList.add(chuyen);
            } else if (loaiThiSinh == 2) {
                System.out.print("Nhap diem csdl: ");
                double csdl = scanner.nextDouble();
                SieuCup sieuCup = new SieuCup(sbd, hoTen, bai1, bai2, bai3, csdl);
                thiSinhList.add(sieuCup);
            }
        }

        System.out.println("\nKet qua thi sinh:");
        for (ThiSinh thiSinh : thiSinhList) {
            System.out.println(thiSinh + ", Tong diem: " + thiSinh.tongDiem());
        }

        scanner.close();
    }
}
