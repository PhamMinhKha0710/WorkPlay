import java.util.ArrayList;
import java.util.Scanner;

public class DSHANGHOA {

    private ArrayList<HANGHOA> ds;
    private Scanner nhap = new Scanner(System.in);

    public DSHANGHOA(ArrayList<HANGHOA> ds, int kg) {
        this.ds = ds;
    }

    public DSHANGHOA() {
        ds = new ArrayList<>();
    }

    public DSHANGHOA(DSHANGHOA x) {
        this.ds = new ArrayList<>(x.ds);
    }

    public void them() {
        System.out.println(" DM:1,TP:2");
        int l = nhap.nextInt();
        if (l == 1) {
            HANGDM dm = new HANGDM();
            dm.nhap();
            ds.add(new HANGDM(dm));
        } else {
            HANGTP tp = new HANGTP();
            tp.nhap();
            ds.add(new HANGTP(tp));
        }
    }

    public void xuatDSTheoLoai() {
        System.out.println("CHON MAT HANG CAN XUAT RA: (DM:1,TP:2) ");
        int l = nhap.nextInt();
        if (l == 1) {
            for (HANGHOA hanghoa : ds) {
                if (hanghoa instanceof HANGDM) {
                    System.out.println(hanghoa.toString());
                }
            }
        } else {
            for (HANGHOA hanghoa : ds) {
                if (hanghoa instanceof HANGTP) {
                    System.out.println(hanghoa.toString());
                }
            }
        }
    }
}



public class Main {
    public static void main(String[] args) {
        DSHANGHOA danhSachHangHoa = new DSHANGHOA();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("MENU:");
            System.out.println("1. Thêm hàng hóa");
            System.out.println("2. Xuất danh sách hàng hóa theo loại");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    danhSachHangHoa.them();
                    break;
                case 2:
                    danhSachHangHoa.xuatDSTheoLoai();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }
        } while (choice != 0);

        scanner.close();
    }
}



