package LamQuenVoiJava;
import java.util.*;
//nhap mot sinh vien
public class Nhap1SV {
    public static void Nhap1SV(String[] args) {
        Scanner sc = new Scanner(System.in);


        String masv = sc.nextLine();


        String hoten = sc.nextLine();


        int tuoi = Integer.parseInt(sc.nextLine());


        int namsinh = Integer.parseInt(sc.nextLine());


        float dtb = Float.parseFloat(sc.nextLine());


        System.out.print(masv + " - " + hoten + " - " + tuoi + " - " + namsinh + " - " + dtb);
    }
}