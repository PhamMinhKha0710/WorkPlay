import java.util.Scanner;

interface HINH {
    public static final float pi = 3.14f;

    void Nhap();
    void Xuat();
    float DienTich();
}


class HINHVUONG implements HINH {
    private float canh;

    // Default constructor
    public HINHVUONG() {
    }

    // Parameterized constructor
    public HINHVUONG(float canh) {
        this.canh = canh;
    }

    // Copy constructor
    public HINHVUONG(HINHVUONG other) {
        this.canh = other.canh;
    }

    // Getter and setter
    public float getCanh() {
        return canh;
    }

    public void setCanh(float canh) {
        this.canh = canh;
    }

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



class HINHCHUNHAT implements HINH {
    private float dai;
    private float rong;

    // Default constructor
    public HINHCHUNHAT() {
    }

    // Parameterized constructor
    public HINHCHUNHAT(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }

    // Copy constructor
    public HINHCHUNHAT(HINHCHUNHAT other) {
        this.dai = other.dai;
        this.rong = other.rong;
    }

    // Getter and setter
    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }

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



class HINHTRON implements HINH {
    private float bankinh;

    // Default constructor
    public HINHTRON() {
    }

    // Parameterized constructor
    public HINHTRON(float bankinh) {
        this.bankinh = bankinh;
    }

    // Copy constructor
    public HINHTRON(HINHTRON other) {
        this.bankinh = other.bankinh;
    }

    // Getter and setter
    public float getBankinh() {
        return bankinh;
    }

    public void setBankinh(float bankinh) {
        this.bankinh = bankinh;
    }

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



public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hinh: ");
        int n = sc.nextInt();
        HINH[] ds = new HINH[n];

        // Nhap danh sach hinh
        for (int i = 0; i < n; i++) {
            System.out.println("Chon loai hinh se nhap:");
            System.out.println("1: hinh vuong");
            System.out.println("2: hinh chu nhat");
            System.out.println("3: hinh tron");
            int chon = sc.nextInt();

            switch (chon) {
                case 1:
                    ds[i] = new HINHVUONG();
                    ds[i].Nhap();
                    break;
                case 2:
                    ds[i] = new HINHCHUNHAT();
                    ds[i].Nhap();
                    break;
                case 3:
                    ds[i] = new HINHTRON();
                    ds[i].Nhap();
                    break;
                default:
                    System.out.println("Ban phai chon 1 trong 3 loai tren");
                    i--; // repeat this iteration
                    break;
            }
        }

        // Xuat danh sach hinh va tinh dien tich
        for (int k = 0; k < n; k++) {
            ds[k].Xuat();
            System.out.println("Dien tich: " + ds[k].DienTich());
        }

        sc.close();
    }
}