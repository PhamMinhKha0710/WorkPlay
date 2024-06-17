package ex_4;

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