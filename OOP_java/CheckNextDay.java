import java.util.Scanner;

public class CheckNextDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minYear = 0, maxYear = 10000;
        int Ngay, Thang, Nam;

        do {
            System.out.print("Moi nhap nam: ");
            Nam = Integer.parseInt(scanner.nextLine());
            if (Nam < minYear || Nam > maxYear) {
                System.out.println("Du lieu khong hop le. Nhap lai!");
            }
        } while (Nam < minYear || Nam > maxYear);

        do {
            System.out.print("Moi nhap thang: ");
            Thang = Integer.parseInt(scanner.nextLine());
            if (Thang < 1 || Thang > 12) {
                System.out.println("Du lieu khong hop le. Nhap lai!");
            }
        } while (Thang < 1 || Thang > 12);

        int NgayTrongThang = TimSoNgayTrongThang(Thang, Nam);
        do {
            System.out.print("Moi nhap ngay: ");
            Ngay = Integer.parseInt(scanner.nextLine());
            if (Ngay < 1 || Ngay > NgayTrongThang) {
                System.out.println("Du lieu khong hop le. Nhap lai!");
            }
        } while (Ngay < 1 || Ngay > NgayTrongThang);

        TimNgayKeTiep(Ngay, Thang, Nam);
    }

    static int KiemTraNamNhuan(int nam) {
        return (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0) ? 1 : 0;
    }

    static int TimSoNgayTrongThang(int thang, int nam) {
        int NgayTrongThang;
        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                NgayTrongThang = 31;
                break;
            case 4: case 6: case 9: case 11:
                NgayTrongThang = 30;
                break;
            case 2:
                int Check = KiemTraNamNhuan(nam);
                NgayTrongThang = (Check == 1) ? 29 : 28;
                break;
            default:
                NgayTrongThang = 0;
        }
        return NgayTrongThang;
    }

    static void TimNgayKeTiep(int Ngay, int Thang, int Nam) {
        int NgayTrongThang = TimSoNgayTrongThang(Thang, Nam);
        if (Ngay < NgayTrongThang) {
            Ngay++;
        } else if (Thang < 12) {
            Ngay = 1;
            Thang++;
        } else {
            Ngay = Thang = 1;
            Nam++;
        }
        System.out.println("\nNgay ke tiep la: " + Ngay + " - " + Thang + " - " + Nam);
        if (Ngay == 7 && Thang == 10) {
            System.out.println("Chuc mung sinh nhat Pham Minh Kha!");
        }
    }
}
