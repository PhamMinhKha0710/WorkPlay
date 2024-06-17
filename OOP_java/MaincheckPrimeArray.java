public class MaincheckPrimeArray {
    public static void main(String[] args) {
        // Số phần tử của mảng
        int n = 10;
        
        // Biên dưới và biên trên cho giá trị ngẫu nhiên (có cả số âm)
        int lowerBound = -50;
        int upperBound = 50;

        // Phát sinh mảng ngẫu nhiên
        int[] randomArray = RandomPrimeArray.generateRandomArray(n, lowerBound, upperBound);

        // In mảng ban đầu
        System.out.print("mang phat sinh ngau nhien: ");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // In các số nguyên tố trong mảng
        RandomPrimeArray.printPrimeNumbers(randomArray);

        // Đếm và in số lượng số nguyên tố trong mảng
        int primeCount = RandomPrimeArray.countPrimeNumbers(randomArray);
        System.out.println("Tong so luong so nguyen to trong mang: " + primeCount);
    }
}
