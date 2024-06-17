import java.util.Scanner;
class HINHCHUNHAT implements HINH {
    private float dai;
    private float rong;

    @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        dai = sc.nextFloat();
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        rong = sc.nextFloat();
    }

    @Override
    public void Xuat() {
        System.out.println("Hinh chu nhat co chieu dai: " + dai + " va chieu rong: " + rong);
    }

    @Override
    public float DienTich() {
        return dai * rong;
    }
}

