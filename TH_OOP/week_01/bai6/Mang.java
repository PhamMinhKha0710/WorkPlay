import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

class Mang {

    private int soPhanTu;
    private int[] mang;
    private int kichThuoc;

    // Constructor không tham số
    public Mang(int kichThuoc) {
        this.kichThuoc = kichThuoc;
        this.mang = new int[kichThuoc];
        this.soPhanTu = 0;
    }

    // Phương thức set/get cho soPhanTu, mang, kichThuoc
    public void setSoPhanTu(int soPhanTu) {
        this.soPhanTu = soPhanTu;
    }

    public int getSoPhanTu() {
        return soPhanTu;
    }

    public void setMang(int[] mang) {
        this.mang = mang;
    }

    public int[] getMang() {
        return mang;
    }

    public void setKichThuoc(int kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public int getKichThuoc() {
        return kichThuoc;
    }

    // Phương thức nhập mảng
    public void input(Scanner scanner) {
        System.out.print("nhap so luong phan tu cua mang (không quá " + kichThuoc + "): ");
        soPhanTu = scanner.nextInt();
        mang = new int[soPhanTu];
        for (int i = 0; i < soPhanTu; i++) {
            System.out.print("Nhap gia tri thu " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }
    }

    // Phương thức xuất mảng
    public void output() {
        System.out.println("Cac phan tu cua mang la: ");
        for (int i = 0; i < soPhanTu; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();
    }

    // Tính trung bình cộng các số lẻ trong mảng
    public double tinhTrungBinhSoLe() {
        int tongSoLe = 0, demSoLe = 0;
        for (int i = 0; i < soPhanTu; i++) {
            if (mang[i] % 2 != 0) {
                tongSoLe += mang[i];
                demSoLe++;
            }
        }
        return demSoLe == 0 ? 0 : (double) tongSoLe / demSoLe;
    }

    // Tìm phần tử lớn nhất trong mảng
    public int timPhanTuLonNhat() {
        int max = mang[0];
        for (int i = 1; i < soPhanTu; i++) {
            if (mang[i] > max) {
                max = mang[i];
            }
        }
        return max;
    }

    // Sắp xếp mảng theo thứ tự tăng dần
    public void sapXepTangDan() {
        Arrays.sort(mang, 0, soPhanTu);
    }

    //random
    public int Rand(int a,int b){
        Random rd = new Random();
        return rd.nextInt(b-a+1) + a;   
    }
}