import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomPrimeArray {
    
    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Hàm phát sinh mảng ngẫu nhiên có cả số âm
    public static int[] generateRandomArray(int n, int lowerBound, int upperBound) {
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        }
        return array;
    }

    // Hàm lấy ra các số nguyên tố từ mảng
    public static List<Integer> getPrimeNumbers(int[] array) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int num : array) {
            if (isPrime(num)) {
                primeNumbers.add(num);
            }
        }
        return primeNumbers;
    }

    // Hàm in ra các số nguyên tố từ mảng
    public static void printPrimeNumbers(int[] array) {
        List<Integer> primeNumbers = getPrimeNumbers(array);
        System.out.println("Cac so nguyen to trong mang: " + primeNumbers);
    }

    // Hàm đếm số lượng số nguyên tố trong mảng
    public static int countPrimeNumbers(int[] array) {
        return getPrimeNumbers(array).size();
    }
}
