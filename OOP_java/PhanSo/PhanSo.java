public class PhanSo {

    private int tuSo, mauSo = 1;

    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    private int ucln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    private void RutGon() {
        if (tuSo == 0)
            return;
        int x = ucln(tuSo, mauSo);
        tuSo /= x;
        mauSo /= x;
    }

    private void doiDauMauSo() {
        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
        doiDauMauSo();
        RutGon();
    }

    public void setMauSo(int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mau so khong the bang 0");
        }
        this.mauSo = mauSo;
        doiDauMauSo();
        RutGon();
    }

    public PhanSo(int tuSo, int mauSo) {
        setTuSo(tuSo);
        setMauSo(mauSo);
    }

    public PhanSo(PhanSo p) {
        tuSo = p.tuSo;
        mauSo = p.mauSo;
        RutGon();
    }

    public PhanSo(int n) {
        tuSo = n;
        mauSo = 1;
    }

    public void xuat() {
        if (tuSo == 0)
            System.out.print("[0]");
        else if (mauSo == 1)
            System.out.print("[" + tuSo + "]");
        else
            System.out.print("[" + tuSo + "/" + mauSo + "]");
    }

    public PhanSo cong(PhanSo p) {
        int newTuSo = this.tuSo * p.mauSo + p.tuSo * this.mauSo;
        int newMauSo = this.mauSo * p.mauSo;
        return new PhanSo(newTuSo, newMauSo);
    }
}
