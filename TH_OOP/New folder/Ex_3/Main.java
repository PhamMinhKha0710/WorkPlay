package Ex_3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng COORDINATE mặc định
        COORDINATE p1 = new COORDINATE();
        System.out.print("Ket qua khoi tao chuan p1: ");
        p1.Xuat();

        // Nhập tọa độ từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap hoanh do: ");
        int a = sc.nextInt();
        System.out.print("Nhap tung do: ");
        int b = sc.nextInt();

        // Tạo đối tượng COORDINATE mới với tọa độ nhập vào
        COORDINATE p2 = new COORDINATE(a, b);
        System.out.print("Ket qua khoi tao p2: ");
        p2.Xuat();

        // Tính tổng và in ra kết quả
        System.out.println("Ket qua cong toa do p1 + p2: " + p1.Tong(p2));

        // Lấy điểm đối xứng và in ra kết quả
        COORDINATE tmp = p2.DoiXung();
        System.out.print("Ket qua diem doi xung cua p2: ");
        tmp.Xuat();
    }
}