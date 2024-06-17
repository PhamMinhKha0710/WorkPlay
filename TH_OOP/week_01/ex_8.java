import java.util.Arrays;
import java.util.Random;

public class ex_8 {
    public static void main(String[] args) {
        //public random
        int[] mang = new int[20];
        random(mang);
        //public output
        System.out.print("Mang ban dau: ");
        output(mang);
        //public sort
        sort(mang);
        System.out.print("Mang sau khi ss tang: ");
        output(mang);
    }
    //random
    public static void random(int[] mang) {
        Random rand = new Random();
        for (int i = 0; i < mang.length; i++) {
            mang[i] = rand.nextInt(50); 
        }
    }
    //output
    public static void output(int[] mang) {
        System.out.println(Arrays.toString(mang));
    }
    //sort
    public static void sort(int[] mang) {
        Arrays.sort(mang);
    }
}
