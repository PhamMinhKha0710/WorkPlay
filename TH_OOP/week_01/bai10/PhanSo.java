import java.util.Scanner;

class PhanSo {

    private int tuSo;
    private int mauSo;

    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1; // Mẫu số mặc định là 1 để tránh chia cho 0
    }

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
        if (mauSo != 0) {
            this.mauSo = mauSo;
        } else {
            this.mauSo = 1; // Đặt mẫu số mặc định là 1 nếu mẫu số bằng 0
        }
    }

    // Phương thức nhập thông tin phân số
    public void input(Scanner scanner) {
        System.out.print("Tu So: ");
        tuSo = scanner.nextInt();
        do {
            System.out.print("mau So (khác 0): ");
            mauSo = scanner.nextInt();
            if (mauSo == 0) {
                System.out.println("Mau phai khac 0. Nhap lai!");
            }
        } while (mauSo == 0);
    }

    // Phương thức xuất thông tin phân số
    public void output() {
        System.out.println(tuSo + "/" + mauSo);
    }

    // Phương thức rút gọn phân số
    public void rutGon() {
        int ucln = timUCLN(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;
    }

    // Phương thức cộng 2 phân số
    public PhanSo congPhanSo(PhanSo ps) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = this.tuSo * ps.mauSo + this.mauSo * ps.tuSo;
        ketQua.mauSo = this.mauSo * ps.mauSo;
        ketQua.rutGon(); // Rút gọn phân số sau khi cộng
        return ketQua;
    }

    // Phương thức tìm ước chung lớn nhất
    private int timUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}