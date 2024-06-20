import java.io.*;
import java.util.Scanner;

//Xây dựng lớp PHANSO
class PhanSo {
    int tuSo = 1;
    int mauSo = 1;

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
        rutGon();
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
        doiDauMauSo();
        rutGon();
    }

    public int uocChungLonNhat(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public void rutGon() {
        if (tuSo == 0 || mauSo == 0) {
            return;
        }
        int x = uocChungLonNhat(tuSo, mauSo);
        if (x != 1) {
            tuSo /= x;
            mauSo /= x;
        }
    }

    public void doiDauMauSo() {
        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }

    public void set(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        doiDauMauSo();
        rutGon();
    }
    
    public PhanSo cong(PhanSo p) {
        PhanSo kq = new PhanSo();
        kq.tuSo = tuSo * p.mauSo + mauSo * p.tuSo;
        kq.mauSo = mauSo * p.mauSo;
        kq.rutGon();
        return kq;
    }

    public void xuat() {
        if (tuSo == 0) {
            System.out.print("0");
        } else if (mauSo == 0) {
            System.out.print("Infinity");
        } else if (mauSo == 1) {
            System.out.print(tuSo);
        } else {
            System.out.print(tuSo + "/" + mauSo);
        }
    }
}

public class Main8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PhanSo p1 = new PhanSo();

        int tuSo1 = scan.nextInt();
        int mauSo1 = scan.nextInt();
        p1.set(tuSo1, mauSo1);
        
        PhanSo p2 = new PhanSo();

        int tuSo2 = scan.nextInt();
        int mauSo2 = scan.nextInt();
        p2.set(tuSo2, mauSo2);
        
        PhanSo p3 = p1.cong(p2);
        p3.xuat();

        System.out.println();
    }
}
