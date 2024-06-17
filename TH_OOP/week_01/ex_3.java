import java.util.Random;
import java.util.Scanner;

class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(101);
            System.out.println("Phan tu thu " + i + ": " + arr[i]);
        }
        int max = findMax(arr);
        System.out.println("Phan Tu lon nhat trong mang la: " + max);
        sc.close();
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
