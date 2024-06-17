package bangluong;
class Nguoi {
    protected String maSo;
    protected String hoTen;
    protected double luong;

    public Nguoi(String maSo, String hoTen) {
        this.maSo = maSo;
        this.hoTen = hoTen;
    }

    public double tinhLuong() {
        return this.luong;
    }

    @Override
    public String toString() {
        return "Ma so: " + this.maSo + ", Ho ten: " + this.hoTen + ", Luong: " + this.luong;
    }
}
