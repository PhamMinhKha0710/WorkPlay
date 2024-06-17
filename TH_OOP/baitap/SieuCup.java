package baitap;

class SieuCup extends ThiSinh {
    private double csdl;

    public SieuCup() {}

    public SieuCup(String sbd, String hoTen, double bai1, double bai2, double bai3, double csdl) {
        super(sbd, hoTen, bai1, bai2, bai3);
        this.csdl = csdl;
    }

    public void setCSDL(double csdl) {
        this.csdl = csdl;
    }

    @Override
    public double tongDiem() {
        return super.tongDiem() + csdl;
    }

    @Override
    public String toString() {
        return super.toString() + ", Diem csdl: " + csdl;
    }
}