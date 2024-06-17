import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hinh: ");
        int n = sc.nextInt();
        HINH[] ds = new HINH[n];

        // Nhap danh sach hinh
        for (int i = 0; i < n; i++) {
            System.out.println("Chon loai hinh se nhap:");
            System.out.println("1: hinh vuong");
            System.out.println("2: hinh chu nhat");
            System.out.println("3: hinh tron");
            int chon = sc.nextInt();

            switch (chon) {
                case 1:
                    ds[i] = new HINHVUONG();
                    ds[i].Nhap();
                    break;
                case 2:
                    ds[i] = new HINHCHUNHAT();
                    ds[i].Nhap();
                    break;
                case 3:
                    ds[i] = new HINHTRON();
                    ds[i].Nhap();
                    break;
                default:
                    System.out.println("Ban phai chon 1 trong 3 loai tren");
                    i--; // repeat this iteration
                    break;
            }
        }

        // Xuat danh sach hinh va tinh dien tich
        for (int k = 0; k < n; k++) {
            ds[k].Xuat();
            System.out.println("Dien tich: " + ds[k].DienTich());
        }
    }
}
