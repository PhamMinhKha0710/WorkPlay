
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ex_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume new line left-over

        List<HocSinh> danhSachHocSinh = new ArrayList<>();

        //input hs
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin hoc sinh thu " + (i + 1) + ":");
            HocSinh hs = new HocSinh();
            hs.input(scanner);
            danhSachHocSinh.add(hs);
        }

        // output hoc sinh is changed
        for (int i = 0; i < n; i++) {
            HocSinh hs = danhSachHocSinh.get(i);
            System.out.println("\nThong tin hoc sinh thu " + (i + 1) + ":");
            hs.output();

            System.out.print("Nhap ten moi cho hoc sinh: ");
            String tenMoi = scanner.nextLine();
            hs.setHoTen(tenMoi);

            System.out.println("Thong tin hoc sinh sau khi doi ten:");
            hs.output();
        }

        // find hs max
        HocSinh hsMax = danhSachHocSinh.get(0);
        for (HocSinh hs : danhSachHocSinh) {
            if (hs.getDiemTrungBinh() > hsMax.getDiemTrungBinh()) {
                hsMax = hs;
            }
        }

        System.out.println("\nHoc sinh co diem trung binh cao nhat la: " + HocSinh.removeVietnameseDiacritics(hsMax.getHoTen()) + " voi diem trung binh: " + hsMax.getDiemTrungBinh());

        scanner.close();
    }
}