import java.util.Scanner;

class PhanSo {
    int tuSo = 1;
    int mauSo = 1;

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
        doiDauMauSo();
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

public class Main4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PhanSo p1 = new PhanSo();

        int tuSo = scan.nextInt();
        int mauSo = scan.nextInt();
        p1.set(tuSo, mauSo);

        p1.xuat();
        System.out.println();
    }
}
