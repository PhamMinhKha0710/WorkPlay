package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ThiSinh {
    protected String sbd;
    protected String hoTen;
    protected double bai1;
    protected double bai2;
    protected double bai3;

    public ThiSinh() {}

    public ThiSinh(String sbd, String hoTen, double bai1, double bai2, double bai3) {
        this.sbd = sbd;
        this.hoTen = hoTen;
        this.bai1 = bai1;
        this.bai2 = bai2;
        this.bai3 = bai3;
    }

    public void setBai1(double bai1) {
        this.bai1 = bai1;
    }

    public void setBai2(double bai2) {
        this.bai2 = bai2;
    }

    public void setBai3(double bai3) {
        this.bai3 = bai3;
    }

    public double tongDiem() {
        return bai1 + bai2 + bai3;
    }

    @Override
    public String toString() {
        return "SBD: " + sbd + ", Ho ten: " + hoTen;
    }
}
