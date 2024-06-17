public class ex_7 {
    public static void main(String[] args) {
        int startNumber = 2;
        int endNumber = 9;
        for (int i = 1; i <= 9; i++) {
            for (int j = startNumber; j <= endNumber; j++) {
                System.out.printf("%d x %d = %-3d ", j, i, (j * i));
            }
            System.out.println();
        }
    }
}
