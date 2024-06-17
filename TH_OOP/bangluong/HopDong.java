package bangluong;

class HopDong extends Nguoi {
    private double tienCongLaoDongMotNgay;
    private int soNgayLamViecTrongThang;
    private double heSoVuotGio;

    public HopDong(String maSo, String hoTen, double tienCongLaoDongMotNgay, int soNgayLamViecTrongThang, double heSoVuotGio) {
        super(maSo, hoTen);
        this.tienCongLaoDongMotNgay = tienCongLaoDongMotNgay;
        this.soNgayLamViecTrongThang = soNgayLamViecTrongThang;
        this.heSoVuotGio = heSoVuotGio;
    }

    @Override
    public double tinhLuong() {
        return this.tienCongLaoDongMotNgay * this.soNgayLamViecTrongThang * (1 + this.heSoVuotGio);
    }

    @Override
    public String toString() {
        return super.toString() + ", Tien cong lao dong mot ngay: " + this.tienCongLaoDongMotNgay + ", So ngay lam viec trong thang: " + this.soNgayLamViecTrongThang + ", He so vuot gio: " + this.heSoVuotGio;
    }
}