package EX_6;
public class PhuongTrinhBacNhat {
    private int a, b;

    public PhuongTrinhBacNhat() {
        this.a = 0;
        this.b = 0;
    }

    public PhuongTrinhBacNhat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void giaiPT() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            float x = (float) -b / a;
            System.out.println("Phuong trinh co 1 nghiem x = " + x);
        }
    }
}
