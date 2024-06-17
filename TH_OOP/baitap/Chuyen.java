package baitap;

class Chuyen extends ThiSinh {
    private double tiengAnh;

    public Chuyen() {}

    public Chuyen(String sbd, String hoTen, double bai1, double bai2, double bai3, double tiengAnh) {
        super(sbd, hoTen, bai1, bai2, bai3);
        this.tiengAnh = tiengAnh;
    }

    public void setTiengAnh(double tiengAnh) {
        this.tiengAnh = tiengAnh;
    }

    @Override
    public double tongDiem() {
        double tongDiem = super.tongDiem();
        if (tiengAnh >= 7 && tiengAnh < 8) {
            tongDiem += 0.5;
        } else if (tiengAnh >= 8 && tiengAnh < 9) {
            tongDiem += 1;
        } else if (tiengAnh >= 9 && tiengAnh <= 10) {
            tongDiem += 2;
        }
        return tongDiem;
    }

    @Override
    public String toString() {
        return super.toString() + ", Diem tieng Anh: " + tiengAnh;
    }
}