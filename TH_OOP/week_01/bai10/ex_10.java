import java.util.Scanner;

public class ex_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan so: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        PhanSo[] phanSoArray = new PhanSo[n];

        // Nhập thông tin cho n phân số
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho phan so thu : " + (i + 1) + ":");
            PhanSo ps = new PhanSo();
            ps.input(scanner);
            phanSoArray[i] = ps;
        }

        // Xuất thông tin và rút gọn từng phân số
        for (int i = 0; i < n; i++) {
            System.out.println("Phan so thu " + (i + 1) + " sau khi rut gon:");
            phanSoArray[i].rutGon();
            phanSoArray[i].output();
        }

        // Tính tổng các phân số và xuất kết quả
        PhanSo tong = new PhanSo();
        for (int i = 0; i < n; i++) {
            tong = tong.congPhanSo(phanSoArray[i]);
        }
        System.out.println("Tong cac phan so la:");
        tong.output();

        scanner.close();
    }
}
