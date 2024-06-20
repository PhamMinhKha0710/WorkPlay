import java.util.Scanner;

class PHANSO {
    private int tuSo;
    private int mauSo;

    // Phương thức khởi tạo chuẩn (không tham số)
    public PHANSO() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    // Phương thức khởi tạo 2 tham số
    public PHANSO(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mẫu số không thể bằng 0.");
        }
        this.mauSo = mauSo;
    }

    // Phương thức nhập phân số
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        tuSo = sc.nextInt();
        System.out.print("Nhập mẫu số: ");
        mauSo = sc.nextInt();
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mẫu số không thể bằng 0.");
        }
    }

    // Phương thức in phân số
    public void output() {
        if (mauSo == 1) {
            System.out.println(tuSo);
        } else if (tuSo == 0) {
            System.out.println(0);
        } else {
            System.out.println(tuSo + "/" + mauSo);
        }
    }

    // Tìm UCLN
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Phương thức rút gọn phân số
    public PHANSO reduce() {
        int ucln = gcd(Math.abs(tuSo), Math.abs(mauSo));
        tuSo /= ucln;
        mauSo /= ucln;
        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
        return this;
    }

    // Phương thức cộng 2 phân số
    public PHANSO add(PHANSO ps) {
        int newTuSo = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
        int newMauSo = this.mauSo * ps.mauSo;
        return new PHANSO(newTuSo, newMauSo).reduce();
    }

    // Phương thức trừ 2 phân số
    public PHANSO subtract(PHANSO ps) {
        int newTuSo = this.tuSo * ps.mauSo - ps.tuSo * this.mauSo;
        int newMauSo = this.mauSo * ps.mauSo;
        return new PHANSO(newTuSo, newMauSo).reduce();
    }

    // Phương thức nhân 2 phân số
    public PHANSO multiply(PHANSO ps) {
        int newTuSo = this.tuSo * ps.tuSo;
        int newMauSo = this.mauSo * ps.mauSo;
        return new PHANSO(newTuSo, newMauSo).reduce();
    }

    // Phương thức chia 2 phân số
    public PHANSO divide(PHANSO ps) {
        if (ps.tuSo == 0) {
            throw new IllegalArgumentException("Không thể chia cho 0.");
        }
        int newTuSo = this.tuSo * ps.mauSo;
        int newMauSo = this.mauSo * ps.tuSo;
        return new PHANSO(newTuSo, newMauSo).reduce();
    }
}

public class DEMO {
    public static void main(String[] args) {
        PHANSO ps1 = new PHANSO();
        PHANSO ps2 = new PHANSO();

        System.out.println("Nhập phân số thứ nhất:");
        ps1.input();
        System.out.println("Nhập phân số thứ hai:");
        ps2.input();

        System.out.print("Phân số thứ nhất: ");
        ps1.output();
        System.out.print("Phân số thứ hai: ");
        ps2.output();

        PHANSO sum = ps1.add(ps2);
        System.out.print("Tổng của hai phân số: ");
        sum.output();

        PHANSO difference = ps1.subtract(ps2);
        System.out.print("Hiệu của hai phân số: ");
        difference.output();

        PHANSO product = ps1.multiply(ps2);
        System.out.print("Tích của hai phân số: ");
        product.output();

        PHANSO quotient = ps1.divide(ps2);
        System.out.print("Thương của hai phân số: ");
        quotient.output();
    }
}