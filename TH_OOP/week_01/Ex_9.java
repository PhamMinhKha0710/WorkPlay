
import java.util.Random;
import java.util.Scanner;

public class Ex_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("NHap so dong cua ma tran: ");
        int soDong = scanner.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int soCot = scanner.nextInt();
        int[][] maTran = new int[soDong][soCot];
        sinhMaTranNgauNhien(maTran);
        xuatMaTran(maTran);
        System.out.print("Nhap dong thu k can tinh tong: ");
        int k = scanner.nextInt();
        if (k >= 0 && k < soDong) {
            int tong = tinhTongDongK(maTran, k);
            System.out.printf("Sum %d là: %d%n", k, tong);
        } else {
            System.out.println("Dong k khong hop le.");
        }
        scanner.close();
    }
    public static void sinhMaTranNgauNhien(int[][] maTran) {
        Random rand = new Random();
        for (int i = 0; i < maTran.length; i++) {
            for (int j = 0; j < maTran[i].length; j++) {
                maTran[i][j] = rand.nextInt(100);
            }
        }
    }

    public static void xuatMaTran(int[][] maTran) {
        System.out.println("Ma tran duoc sinh ra ngau nhien:");
        for (int i = 0; i < maTran.length; i++) {
            for (int j = 0; j < maTran[i].length; j++) {
                System.out.print(maTran[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int tinhTongDongK(int[][] maTran, int k) {
        int tong = 0;
        for (int i = 0; i < maTran[k].length; i++) {
            tong += maTran[k][i];
        }
        return tong;
    }
}
