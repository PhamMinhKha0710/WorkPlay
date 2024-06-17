package bangluong;

import java.util.Scanner;

public class Main {
    // Dinh nghia muc luong co ban la hang so
    private static final double MUC_LUONG_CO_BAN = 3000000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap thong tin cho can bo BienChe
        System.out.println("Nhap thong tin cho can bo BienChe:");
        System.out.print("Ma so: ");
        String maSoBienChe = scanner.nextLine();
        System.out.print("Ho ten: ");
        String hoTenBienChe = scanner.nextLine();
        System.out.print("He so luong: ");
        double heSoLuong = scanner.nextDouble();
        System.out.print("He so phu cap chuc vu: ");
        double heSoPhuCapChucVu = scanner.nextDouble();
        scanner.nextLine(); // Doc bo dong moi

        BienChe canBo = new BienChe(maSoBienChe, hoTenBienChe, heSoLuong, heSoPhuCapChucVu);

        // Nhap thong tin cho nhan vien HopDong
        System.out.println("Nhap thong tin cho nhan vien HopDong:");
        System.out.print("Ma so: ");
        String maSoHopDong = scanner.nextLine();
        System.out.print("Ho ten: ");
        String hoTenHopDong = scanner.nextLine();
        System.out.print("Tien cong lao dong mot ngay: ");
        double tienCongLaoDongMotNgay = scanner.nextDouble();
        System.out.print("So ngay lam viec trong thang: ");
        int soNgayLamViecTrongThang = scanner.nextInt();
        System.out.print("He so vuot gio: ");
        double heSoVuotGio = scanner.nextDouble();

        HopDong nhanVien = new HopDong(maSoHopDong, hoTenHopDong, tienCongLaoDongMotNgay, soNgayLamViecTrongThang, heSoVuotGio);

        // In thong tin va luong tinh toan
        System.out.println("\nThong tin can bo BienChe:");
        System.out.println(canBo.toString() + ", Luong: " + canBo.tinhLuong());

        System.out.println("\nThong tin nhan vien HopDong:");
        System.out.println(nhanVien.toString() + ", Luong: " + nhanVien.tinhLuong());

        scanner.close();
    }
}

