import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Abstract class NV
abstract class NV {
    protected String manv;
    protected String tennv;
    protected String trinhdo;
    protected double luongcb;

    // Default constructor
    public NV() {
    }

    // Parameterized constructor
    public NV(String manv, String tennv, String trinhdo, double luongcb) {
        this.manv = manv;
        this.tennv = tennv;
        this.trinhdo = trinhdo;
        this.luongcb = luongcb;
    }

    // Copy constructor
    public NV(NV other) {
        this.manv = other.manv;
        this.tennv = other.tennv;
        this.trinhdo = other.trinhdo;
        this.luongcb = other.luongcb;
    }

    // Getter and setter for manv
    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    // Getter and setter for tennv
    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    // Getter and setter for trinhdo
    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    // Getter and setter for luongcb
    public double getLuongcb() {
        return luongcb;
    }

    public void setLuongcb(double luongcb) {
        this.luongcb = luongcb;
    }

    public void Nhap(Scanner sc) {
        System.out.println("Nhap ma NV:");
        manv = sc.nextLine();

        System.out.println("Nhap ten NV:");
        tennv = sc.nextLine();

        System.out.println("Nhap trinh do:");
        trinhdo = sc.nextLine();

        System.out.println("Nhap luong co ban:");
        luongcb = sc.nextDouble();
        sc.nextLine(); // consume newline
    }

    public void Xuat() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Ma NV: " + manv + ", Ten NV: " + tennv + ", Trinh do: " + trinhdo + ", Luong co ban: " + luongcb;
    }

    public abstract double TinhLuong();
}

// Abstract class NVCC
abstract class NVCC extends NV {
    protected String chuyenmon;

    // Default constructor
    public NVCC() {
        super();
    }

    // Parameterized constructor
    public NVCC(String manv, String tennv, String trinhdo, double luongcb, String chuyenmon) {
        super(manv, tennv, trinhdo, luongcb);
        this.chuyenmon = chuyenmon;
    }

    // Copy constructor
    public NVCC(NVCC other) {
        super(other);
        this.chuyenmon = other.chuyenmon;
    }

    // Getter and setter for chuyenmon
    public String getChuyenmon() {
        return chuyenmon;
    }

    public void setChuyenmon(String chuyenmon) {
        this.chuyenmon = chuyenmon;
    }

    @Override
    public void Nhap(Scanner sc) {
        super.Nhap(sc);
        System.out.println("Nhap chuyen mon:");
        chuyenmon = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", Chuyen mon: " + chuyenmon;
    }
}

// Class NVPV
class NVPV extends NV {
    // Default constructor
    public NVPV() {
        super();
    }

    // Parameterized constructor
    public NVPV(String manv, String tennv, String trinhdo, double luongcb) {
        super(manv, tennv, trinhdo, luongcb);
    }

    // Copy constructor
    public NVPV(NVPV other) {
        super(other);
    }

    @Override
    public double TinhLuong() {
        return luongcb;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

// Class NVQL
class NVQL extends NVCC {
    private long pccv;

    // Default constructor
    public NVQL() {
        super();
    }

    // Parameterized constructor
    public NVQL(String manv, String tennv, String trinhdo, double luongcb, String chuyenmon, long pccv) {
        super(manv, tennv, trinhdo, luongcb, chuyenmon);
        this.pccv = pccv;
    }

    // Copy constructor
    public NVQL(NVQL other) {
        super(other);
        this.pccv = other.pccv;
    }

    // Getter and setter for pccv
    public long getPccv() {
        return pccv;
    }

    public void setPccv(long pccv) {
        this.pccv = pccv;
    }

    @Override
    public void Nhap(Scanner sc) {
        super.Nhap(sc);
        System.out.println("Nhap phu cap chuc vu:");
        pccv = sc.nextLong();
        sc.nextLine(); // consume newline
    }

    @Override
    public String toString() {
        return super.toString() + ", Phu cap chuc vu: " + pccv + ", Luong thuc nhan: " + TinhLuong();
    }

    @Override
    public double TinhLuong() {
        return luongcb + pccv;
    }
}

// Class NVNC
class NVNC extends NVCC {
    private long pcdh;

    // Default constructor
    public NVNC() {
        super();
    }

    // Parameterized constructor
    public NVNC(String manv, String tennv, String trinhdo, double luongcb, String chuyenmon, long pcdh) {
        super(manv, tennv, trinhdo, luongcb, chuyenmon);
        this.pcdh = pcdh;
    }

    // Copy constructor
    public NVNC(NVNC other) {
        super(other);
        this.pcdh = other.pcdh;
    }

    // Getter and setter for pcdh
    public long getPcdh() {
        return pcdh;
    }

    public void setPcdh(long pcdh) {
        this.pcdh = pcdh;
    }

    @Override
    public void Nhap(Scanner sc) {
        super.Nhap(sc);
        System.out.println("Nhap phu cap doanh thu:");
        pcdh = sc.nextLong();
        sc.nextLine(); // consume newline
    }

    @Override
    public String toString() {
        return super.toString() + ", Phu cap doanh thu: " + pcdh + ", Luong thuc nhan: " + TinhLuong();
    }

    @Override
    public double TinhLuong() {
        return luongcb + pcdh;
    }
}

// Class DSNV
class DSNV {
    private int sl;
    private final NV ds[];

    public DSNV() {
        ds = new NV[100];
        sl = 0;
    }

    // Copy constructor
    public DSNV(DSNV other) {
        this.sl = other.sl;
        this.ds = Arrays.copyOf(other.ds, other.ds.length);
    }

    public NV[] getDanhSach() {
        return Arrays.copyOf(ds, sl);
    }

    public void them(NV h) {
        ds[sl++] = h;
    }

    public void xuat(int a) {
        if (a == 1) {
            for (int i = 0; i < sl; i++) {
                if (ds[i] instanceof NVQL) {
                    System.out.println(ds[i]);
                    System.out.println("----------------------\n");
                }
            }
        }
        if (a == 2) {
            for (int i = 0; i < sl; i++) {
                if (ds[i] instanceof NVNC) {
                    System.out.println(ds[i]);
                    System.out.println("----------------------\n");
                }
            }
        }
        if (a == 3) {
            for (int i = 0; i < sl; i++) {
                if (ds[i] instanceof NVPV) {
                    System.out.println(ds[i]);
                    System.out.println("------------------------");
                }
            }
        }
    }

    // New method to calculate total salary
    public double tinhTongLuong() {
        double total = 0;
        for (int i = 0; i < sl; i++) {
            total += ds[i].TinhLuong();
        }
        return total;
    }
}

// Class HOCVIEN
class HOCVIEN {
    private DSNV danhSachNV;

    // Default constructor
    public HOCVIEN() {
        danhSachNV = new DSNV();
    }

    // Parameterized constructor
    public HOCVIEN(DSNV danhSachNV) {
        this.danhSachNV = new DSNV(danhSachNV);
    }

    // Copy constructor
    public HOCVIEN(HOCVIEN other) {
        this.danhSachNV = new DSNV(other.danhSachNV);
    }

    // Getter and setter for danhSachNV
    public DSNV getDanhSachNV() {
        return danhSachNV;
    }

    public void setDanhSachNV(DSNV danhSachNV) {
        this.danhSachNV = danhSachNV;
    }

    public void nhapDanhSach(Scanner sc) {
        System.out.println("Nhap so luong nhan vien:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap loai nhan vien (1- NVQL, 2- NVNC, 3- NVPV):");
            int type = sc.nextInt();
            sc.nextLine(); // consume newline

            NV employee = null; // Declare employee variable outside switch block

            switch (type) {
                case 1:
                    employee = new NVQL();
                    break;
                case 2:
                    employee = new NVNC();
                    break;
                case 3:
                    employee = new NVPV();
                    break;
                default:
                    System.out.println("Loai nhan vien khong hop le, bo qua.");
                    continue; // Skip to the next iteration of the loop
            }

            // Nhap method will be called based on the type of employee
            employee.Nhap(sc);
            danhSachNV.them(employee);
        }
    }

    public void xuatDanhSach() {
        System.out.println("Thong tin nhan vien:");
        danhSachNV.xuat(1);
        danhSachNV.xuat(2);
        danhSachNV.xuat(3);
    }

    public void xuatTongLuong() {
        System.out.println("Tong luong tat ca nhan vien: " + danhSachNV.tinhTongLuong());
    }
}

// Main class Demo
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HOCVIEN hocVien = new HOCVIEN();

        hocVien.nhapDanhSach(sc);
        hocVien.xuatDanhSach();
        hocVien.xuatTongLuong();

        sc.close();
    }
}
