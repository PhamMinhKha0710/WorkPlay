import java.util.Scanner;

public class CONNGUOI {
    protected String hoTen;
    protected int namSinh;

    // Default constructor
    public CONNGUOI() {
    }

    // Parameterized constructor
    public CONNGUOI(String hoTen, int namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    // Copy constructor
    public CONNGUOI(CONNGUOI other) {
        this.hoTen = other.hoTen;
        this.namSinh = other.namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void nhap() {
        Scanner SC = new Scanner(System.in);
        System.out.print("NHAP HO TEN: ");
        hoTen = SC.nextLine();
        System.out.print("NHAP NAM SINH: ");
        namSinh = SC.nextInt();
    }

    public void xuat() {
        System.out.println("HO TEN: " + hoTen);
        System.out.println("NAM SINH: " + namSinh);
    }
}



public class NHANVIEN extends CONNGUOI {
    protected long luong;
    private String ngayNhanViec;
    private PHONGBANKHOA pbk;

    // Default constructor
    public NHANVIEN() {
        super();
        pbk = new PHONGBANKHOA();
    }

    // Parameterized constructor
    public NHANVIEN(String hoTen, int namSinh, long luong, String ngayNhanViec, PHONGBANKHOA pbk) {
        super(hoTen, namSinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.pbk = new PHONGBANKHOA(pbk);
    }

    // Copy constructor
    public NHANVIEN(NHANVIEN other) {
        super(other);
        this.luong = other.luong;
        this.ngayNhanViec = other.ngayNhanViec;
        this.pbk = new PHONGBANKHOA(other.pbk);
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    public String getNgayNhanViec() {
        return ngayNhanViec;
    }

    public void setNgayNhanViec(String ngayNhanViec) {
        this.ngayNhanViec = ngayNhanViec;
    }

    public PHONGBANKHOA getPbK() {
        return pbk;
    }

    public void setPbK(PHONGBANKHOA pbk) {
        this.pbk = pbk;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("NHAP LUONG: ");
        luong = scanner.nextLong();
        scanner.nextLine();
        System.out.print("NHAP NGAY LAM VIEC: ");
        ngayNhanViec = scanner.nextLine();
        pbk.nhap();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("LUONG: " + luong);
        System.out.println("NGAY NHAN VIEC: " + ngayNhanViec);
        pbk.xuat();
    }
}



public class HOCVIEN extends CONNGUOI {
    private double diem1;
    private double diem2;
    private double diem3;

    // Default constructor
    public HOCVIEN() {
        super();
    }

    // Parameterized constructor
    public HOCVIEN(String hoTen, int namSinh, double diem1, double diem2, double diem3) {
        super(hoTen, namSinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    // Copy constructor
    public HOCVIEN(HOCVIEN other) {
        super(other);
        this.diem1 = other.diem1;
        this.diem2 = other.diem2;
        this.diem3 = other.diem3;
    }

    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public double getDiem3() {
        return diem3;
    }

    public void setDiem3(double diem3) {
        this.diem3 = diem3;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner SC = new Scanner(System.in);
        System.out.print("NHAP DIEM 1: ");
        diem1 = SC.nextDouble();
        System.out.print("NHAP DIEM 2: ");
        diem2 = SC.nextDouble();
        System.out.print("NHAP DIEM 3: ");
        diem3 = SC.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("DIEM 1: " + diem1);
        System.out.println("DIEM 2: " + diem2);
        System.out.println("DIEM 3: " + diem3);
    }
}



public class PHONGBANKHOA {
    private String maPBK;
    private String tenPBK;

    // Default constructor
    public PHONGBANKHOA() {
    }

    // Parameterized constructor
    public PHONGBANKHOA(String maPBK, String tenPBK) {
        this.maPBK = maPBK;
        this.tenPBK = tenPBK;
    }

    // Copy constructor
    public PHONGBANKHOA(PHONGBANKHOA other) {
        this.maPBK = other.maPBK;
        this.tenPBK = other.tenPBK;
    }

    public String getMaPBK() {
        return maPBK;
    }

    public void setMaPBK(String maPBK) {
        this.maPBK = maPBK;
    }

    public String getTenPBK() {
        return tenPBK;
    }

    public void setTenPBK(String tenPBK) {
        this.tenPBK = tenPBK;
    }

    public void nhap() {
        Scanner SC = new Scanner(System.in);
        System.out.print("NHAP MA PBK: ");
        maPBK = SC.nextLine();
        System.out.print("NHAP TEN PBK: ");
        tenPBK = SC.nextLine();
    }

    public void xuat() {
        System.out.println("MA PBK: " + maPBK);
        System.out.println("TEN PBK: " + tenPBK);
    }
}



public class DEMO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. NHAP 1 HOC VIEN");
            System.out.println("2. NHAP 1 NHAN VIEN");
            System.out.println("0. THOAT");
            System.out.print("CHON: ");
            choice = sc.nextInt();

            if (choice == 1) {
                HOCVIEN hocVien = new HOCVIEN();
                hocVien.nhap();
                System.out.println("\nTHONG TIN HOC VIEN:");
                hocVien.xuat();
            } else if (choice == 2) {
                NHANVIEN nhanVien = new NHANVIEN();
                nhanVien.nhap();
                System.out.println("\nTHONG TIN NHAN VIEN:");
                nhanVien.xuat();
            }
        } while (choice != 0);

        sc.close();
    }
}



