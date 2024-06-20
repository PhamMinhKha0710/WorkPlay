import java.util.*;

class HOCSINH {
    private String maSo;
    private String hoTen;
    private float dtb = 0.00f;
    
    public HOCSINH() {
    }

    public HOCSINH(String maSo, String hoTen, float dtb) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.dtb = dtb;
    }

    public HOCSINH(HOCSINH h) {
        this.maSo = h.maSo;
        this.hoTen = h.hoTen;
        this.dtb = h.dtb;
    }

    public String getMaSo() {
        return maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float getDtb() {
        return dtb;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }

    public void input(Scanner b) {
        maSo = b.nextLine();
        hoTen = b.nextLine();
        dtb = Float.parseFloat(b.nextLine());
    }
    

    public void output() {
        System.out.println(getMaSo() + " - " + getHoTen() + " - " + getDtb() + " - " + rank());
    }

    public String rank() {
        if (dtb < 5) {
            return "Yeu";
        } else if (dtb < 7) {
            return "Trung Binh";
        } else if (dtb < 8) {
            return "Kha";
        } else {
            return "Gioi";
        }
    }

    public String Sosanh(HOCSINH hs1) {
        if (dtb > hs1.dtb) {
            return getMaSo();
        } else  {
            return hs1.getMaSo();
        } 
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        HOCSINH hs1 = new HOCSINH();
        HOCSINH hs2 = new HOCSINH();
        hs1.input(b);
        hs2.input(b);
        System.out.println(hs1.Sosanh(hs2));
        b.close();
    }
}
