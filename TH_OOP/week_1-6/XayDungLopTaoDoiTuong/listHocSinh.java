import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class HOCSINH {
    private String maso;
    private String hoten;
    private float dtb;

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }

    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so: ");
        maso = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.print("Nhap diem trung binh: ");
        dtb = sc.nextFloat();
        sc.nextLine();  
    }

    public void output() {
        System.out.println(maso + " - " + hoten + " - " + dtb + " - " + getRank());
    }

    public String getRank() {
        if (dtb >= 9) {
            return "Xuat sac";
        } else if (dtb >= 8) {
            return "Gioi";
        } else if (dtb >= 6.5) {
            return "Kha";
        } else if (dtb >= 5) {
            return "Trung binh";
        } else {
            return "Yeu";
        }
    }
}


class DSHOCSINH {
    private ArrayList<HOCSINH> danhSachHS;

    public DSHOCSINH() {
        danhSachHS = new ArrayList<HOCSINH>();
    }

    public void nhapDanhSach() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        int soLuongHS = sc.nextInt();
        sc.nextLine();  

        for (int i = 0; i < soLuongHS; i++) {
            HOCSINH hs = new HOCSINH();
            System.out.println("Nhap thong tin hoc sinh thu " + (i + 1) + ": ");
            hs.input();
            danhSachHS.add(hs);
        }
    }

    public void inDanhSach() {
        for (HOCSINH hs : danhSachHS) {
            hs.output();
        }
    }

    public void sapXepDanhSach() {
        Collections.sort(danhSachHS, new Comparator<HOCSINH>() {
            public int compare(HOCSINH hs1, HOCSINH hs2) {
                return Float.compare(hs2.getDtb(), hs1.getDtb());  // Sort in descending order
            }
        });
    }
}

class DEMO3 {
    public static void main(String[] args) {
        DSHOCSINH dsHocSinh = new DSHOCSINH();
        
        
        dsHocSinh.nhapDanhSach();
        
        
        dsHocSinh.sapXepDanhSach();
        
     
        System.out.println("Danh sach hoc sinh da sap xep theo diem trung binh giam dan:");
        dsHocSinh.inDanhSach();
    }
}