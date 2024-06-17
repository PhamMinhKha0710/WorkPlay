import java.io.*
/**
 * Main3
 */
public class HOCSINH {
    //viet cac phuong thuoc lien quan
    private String maso;
    private String hoten;
    private float dtb;

    public String getMaSo(){
        return maso;
    }
    public void setMaSo(String ms){
        maso = ms;
    }
    //sinh vien tieop tuc lam cho 2 thuoc tinh conf lai (ho ten va diem trung binh)
    public void rank(){
        if(dtb<5){
            System.out.print("Yeu");
        }
    }

    //tu lam tiep

    

    
}
public class Main {
    public static void main(String[] args) {
        HOCSINH hs = new HOCSINH();

        //nhap du lieu Scanner vaf gan gia tri ban phuonmg thuc set ()

        hs.setMaSo(sc.nextLine());
        hs.setHoTen(sc.nextLine());
        hs.setDTB(Float.parseFloat(sc.nextLine()));

        hs.out(); //goi phuong thuc xuat cho doi tuong HOCSINH hs trong hs.rank(); //goi phuong thuc xuat xep hang
        
        
    }

    
}