import java.util.Scanner;
class HINHVUONG implements HINH {
    private float canh;

    @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh hinh vuong: ");
        canh = sc.nextFloat();
    }

    @Override
    public void Xuat() {
        System.out.println("Hinh vuong co canh: " + canh);
    }

    @Override
    public float DienTich() {
        return canh * canh;
    }
}
