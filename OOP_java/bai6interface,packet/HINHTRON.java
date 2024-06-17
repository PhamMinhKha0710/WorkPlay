import java.util.Scanner;
class HINHTRON implements HINH {
    private float bankinh;

    @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        bankinh = sc.nextFloat();
    }

    @Override
    public void Xuat() {
        System.out.println("Hinh tron co ban kinh: " + bankinh);
    }

    @Override
    public float DienTich() {
        return pi * bankinh * bankinh;
    }
}
