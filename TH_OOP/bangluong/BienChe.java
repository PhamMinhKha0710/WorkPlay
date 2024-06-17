package bangluong;

class BienChe extends Nguoi {
    private double heSoLuong;
    private double heSoPhuCapChucVu;

    public BienChe(String maSo, String hoTen, double heSoLuong, double heSoPhuCapChucVu) {
        super(maSo, hoTen);
        this.heSoLuong = heSoLuong;
        this.heSoPhuCapChucVu = heSoPhuCapChucVu;
    }

    @Override
    public double tinhLuong() {
        // Su dung hang so MUC_LUONG_CO_BAN de tinh luong co ban
        return MUC_LUONG_CO_BAN * this.heSoLuong + MUC_LUONG_CO_BAN * this.heSoPhuCapChucVu;
    }

    @Override
    public String toString() {
        return super.toString() + ", He so luong: " + this.heSoLuong + ", He so phu cap chuc vu: " + this.heSoPhuCapChucVu;
    }
}