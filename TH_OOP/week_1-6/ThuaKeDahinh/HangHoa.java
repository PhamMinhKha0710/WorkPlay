//PHAM MINH KHA 2280601362
import java.util.Scanner;

public class HANGHOA {
    protected String mahang;
    protected String tenhang;
    protected long dongia;                             

public HANGHOA()
{
    mahang="";
    tenhang="";
    dongia=0;
}

public HANGHOA(String mahang, String tenhang, long dongia)
{
    this.mahang=mahang;
    this.tenhang=tenhang;
    this.dongia=dongia;
}

public void nhap()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ma hang: ");
    mahang=sc.nextLine();
    System.out.println("Nhap ten hang: ");
    tenhang = sc.nextLine();
    System.out.println("Nhap don gia: ");
    dongia=sc.nextLong();
}
public void xuat()
{
    System.out.println("Ma hang: "+mahang);
    System.out.println("Ten hang: "+tenhang);
    System.out.println("Don gia: "+dongia);
}



}



public class HANGDM extends HANGHOA{
    private int thoigianbh;
    private int dienap;
    private int congsuat;
    public HANGDM() {
        super();
        thoigianbh = 0;
        dienap = 0;
        congsuat = 0;    
    }
    public HANGDM(String mahang, String tenhang, long dongia, int thoigianbh, int dienap, int congsuat) {
        super(mahang, tenhang, dongia);
        this.thoigianbh = thoigianbh;
        this.dienap = dienap;
        this.congsuat = congsuat;
    }
    public HANGDM(HANGDM hd) {
        this.thoigianbh = hd.thoigianbh;
        this.dienap = hd.dienap;
        this.congsuat = hd.congsuat;
    }
    public int getThoigianbh() {
        return thoigianbh;
    }
    public void setThoigianbh(int thoigianbh) {
        this.thoigianbh = thoigianbh;
    }
    public int getDienap() {
        return dienap;
    }
    public void setDienap(int dienap) {
        this.dienap = dienap;
    }
    public int getCongsuat() {
        return congsuat;
    }
    public void setCongsuat(int congsuat) {
        this.congsuat = congsuat;
    }
    @Override
    public void nhap() {
        // TODO Auto-generated method stub
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap thoi gian bao hanh: ");
        thoigianbh = sc.nextInt();
        System.out.println("nhap dien ap: ");
        dienap = sc.nextInt();
        System.out.println("nhap cong suat: ");
        congsuat = sc.nextInt();
    }
    @Override
    public void xuat() {
        // TODO Auto-generated method stub
        super.xuat();
        System.out.println("thoi gian bao hanh: "+thoigianbh);
        System.out.println("dien ap: "+dienap);
        System.out.println("cong suat: "+congsuat);
    }
    @Override
    public String toString() {
        return "HANGDM [thoigianbh=" + thoigianbh + ", dienap=" + dienap + ", congsuat=" + congsuat + "]";
    }
}



public class HANGTP extends HANGHOA {
    private int ngaysx;
    private int ngayhh;
    public HANGTP()
    {
        super();
        ngaysx = 0;
        ngayhh = 0;
    }
    public HANGTP(String mahang, String tenhang, long dongia, int ngaysx, int ngayhh)
    {
        super(mahang, tenhang, dongia);
        this.ngaysx = ngaysx;
        this.ngayhh = ngayhh;
    }
    public HANGTP(HANGTP h)
    {
        this.ngaysx = h.ngaysx;
        this.ngayhh = h.ngayhh;
    }
    public int getNgaysx() {
        return ngaysx;
    }
    public void setNgaysx(int ngaysx) {
        this.ngaysx = ngaysx;
    }
    public int getNgayhh() {
        return ngayhh;
    }
    public void setNgayhh(int ngayhh) {
        this.ngayhh = ngayhh;
    }
    @Override
    public void nhap() {
        // TODO Auto-generated method stub
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay sx: ");
        ngaysx = sc.nextInt();
        System.out.println("Nhap ngay hh: ");
        ngayhh = sc.nextInt();
    }
    @Override
    public void xuat() {
        // TODO Auto-generated method stub
        super.xuat();
        System.out.println("Ngay sx: " + ngaysx);
        System.out.println("Ngay hh: " + ngayhh);
    }
    @Override
    public String toString() {
        return "HANGTP [ngaysx=" + ngaysx + ", ngayhh=" + ngayhh + "]";
    }
   
    
    
}

public class DEMO {
    public static void main(String[] args) {
        HANGDM hdm=new HANGDM();
        System.out.println("nhap thong tin hang dien may:");
        hdm.nhap();
        System.out.println("thong tin hang dien may:");
        hdm.xuat();
        System.out.println("Nhap thong tin hang thuc pham:");
        HANGTP htp=new HANGTP();
        htp.nhap();
        System.out.println("thong tin hang thuc pham:");
        htp.xuat();
    }
}