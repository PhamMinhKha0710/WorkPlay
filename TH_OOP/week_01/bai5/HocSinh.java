import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

class HocSinh {
    private String maSo;
    private String hoTen;
    private double diemTrungBinh;

    // Các phương thức set/get
    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    // Phương thức nhập thông tin
    public void input(Scanner scanner) {
        System.out.print("Nhap ma so hoc sinh: ");
        maSo = scanner.nextLine();
        System.out.print("Nhap ho ten hoc sinh: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap diem trung binh: ");
        diemTrungBinh = scanner.nextDouble();
        scanner.nextLine(); // Consume new line left-over
    }

    // Phương thức xuất thông tin
    public void output() {
        System.out.println("Ma so: " + removeVietnameseDiacritics(maSo));
        System.out.println("Ho ten: " + removeVietnameseDiacritics(hoTen));
        System.out.println("Diem trung binh: " + diemTrungBinh);
        System.out.println("Xep loai: " + removeVietnameseDiacritics(rank()));
    }

    // Phương thức xếp loại
    public String rank() {
        if (diemTrungBinh >= 9) {
            return "Xuat sac";
        } else if (diemTrungBinh >= 8) {
            return "Gioi";
        } else if (diemTrungBinh >= 7) {
            return "Kha";
        } else if (diemTrungBinh >= 5) {
            return "Trung binh";
        } else {
            return "Yeu";
        }
    }
    public static String removeVietnameseDiacritics(String str) {
        String normalized = Normalizer.normalize(str, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalized).replaceAll("").replaceAll("Đ", "D").replaceAll("đ", "d");
    }
}