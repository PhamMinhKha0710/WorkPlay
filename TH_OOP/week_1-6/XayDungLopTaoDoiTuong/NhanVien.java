import java.util.Scanner;

class NhanVien {
    private String maso, hoten;
    private int luong;
    private float heso;
    private static int soluong = 0;

    public NhanVien() {
        maso = null;
        hoten = null;
        luong = 0;
        heso = 0.0f;
        soluong++;
    }

    public NhanVien(String maso, String hoten, int luong, float heso) {
        this.maso = maso;
        this.hoten = hoten;
        this.luong = luong;
        this.heso = heso;
        soluong++;
    }

    public NhanVien(NhanVien p) {
        this.maso = p.maso;
        this.hoten = p.hoten;
        this.luong = p.luong;
        this.heso = p.heso;
        soluong++;
    }

    public void setMaSo(String maso) {
        this.maso = maso;
    }

    public String getMaSo() {
        return maso;
    }

    public void setHoTen(String hoten) {
        this.hoten = hoten;
    }

    public String getHoTen() {
        return hoten;
    }

    public void setHeSo(float heso) {
        this.heso = heso;
    }

    public float getHeSo() {
        return heso;
    }

    public void NhapNV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so: ");
        maso = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.print("Nhap luong: ");
        luong = sc.nextInt();
        System.out.print("Nhap he so luong: ");
        heso = sc.nextFloat();
    }

    public void XuatNV() {
        System.out.println(maso + "\t" + hoten + "\t" + luong + "\t" + heso);
    }

    public float TinhLuong() {
        return luong * heso;
    }

    public static void XuatSoLuong() {
        System.out.println("So luong nhan vien: " + soluong);
    }
}

import java.util.*;

public class demo {
    public static void main(String[] args) {
        // Tạo 3 đối tượng nhân viên bằng 3 cách khác nhau
        NhanVien p1 = new NhanVien();
        NhanVien p2 = new NhanVien("0205", "Phuoc", 1000, 0.3f);
        NhanVien p3 = new NhanVien(p2);

        System.out.println("Thong tin khoi tao:");
        p1.XuatNV();
        p2.XuatNV();
        p3.XuatNV();

        // Nhập dữ liệu cho một nhân viên từ bàn phím, xuất ra màn hình
        System.out.println("Nhap thong tin cho p1:");
        p1.NhapNV();
        System.out.print("Thong tin cua p1: ");
        p1.XuatNV();

        // Thay đổi họ tên cho nhân viên và xuất ra màn hình
        System.out.println("Nhap ten NV moi cho p3:");
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        p3.setHoTen(tmp);
        System.out.print("Thong tin cua p3: ");
        p3.XuatNV();

        // In ra thông tin của nhân viên có hệ số lương cao nhất trong 3 nhân viên
        NhanVien maxHeSoNV = p1;
        if (p2.getHeSo() > maxHeSoNV.getHeSo()) {
            maxHeSoNV = p2;
        }
        if (p3.getHeSo() > maxHeSoNV.getHeSo()) {
            maxHeSoNV = p3;
        }
        System.out.println("Nhan vien co he so luong cao nhat:");
        maxHeSoNV.XuatNV();

        // Nhập danh sách nhân viên và xuất ra màn hình cùng với lương của mỗi nhân viên
        System.out.print("Nhap so luong nhan vien: ");
        int n = sc.nextInt();
        sc.nextLine();  
        NhanVien[] danhSachNV = new NhanVien[n];

        for (int i = 0; i < n; i++) {
            danhSachNV[i] = new NhanVien();
            System.out.println("Nhap thong tin cho nhan vien thu " + (i + 1) + ":");
            danhSachNV[i].NhapNV();
        }

        System.out.println("Danh sach nhan vien:");
        for (int i = 0; i < n; i++) {
            danhSachNV[i].XuatNV();
            System.out.println("Luong: " + danhSachNV[i].TinhLuong());
        }

        // In số lượng nhân viên trong danh sách
        NhanVien.XuatSoLuong();
    }
}