public class Main {
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo(1, 2);
        PhanSo p2 = new PhanSo(1, 3);
        PhanSo p3 = p1.cong(p2);

        p1.xuat(); // [1/2]
        System.out.print(" + ");
        p2.xuat(); // [1/3]
        System.out.print(" = ");
        p3.xuat(); // [5/6]
    }
}
