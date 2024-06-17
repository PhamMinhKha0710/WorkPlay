import java.util.Scanner;
public class ex_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mang mang = new Mang(20);
        mang.input(scanner);
        mang.output();
        double trungBinhSoLe = mang.tinhTrungBinhSoLe();
        System.out.println("TB cong cac so le trong mang la: " + trungBinhSoLe);        
        int max = mang.timPhanTuLonNhat();
        System.out.println("MAX: " + max);     
        mang.sapXepTangDan();
        System.out.println("Mang sau khi sap xep tang:");
        mang.output();
        scanner.close();
    }
}
