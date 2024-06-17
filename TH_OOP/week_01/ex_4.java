import java.util.Random;
import java.util.Scanner;
public class ex_4 {
    public static int[][] taoMaTran(int m, int n) {
        Random rand = new Random();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(51);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }
    // sum
    public static int tinhTong(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số dòng m: ");
        int m = scanner.nextInt();
        System.out.print("Nhập số cột n: ");
        int n = scanner.nextInt();
        int[][] maTran = taoMaTran(m, n);
        int tong = tinhTong(maTran);
        System.out.println("Tổng các phần tử trong ma trận là: " + tong);
        scanner.close();
    }
}

