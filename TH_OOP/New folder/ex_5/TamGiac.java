package ex_5;

import java.util.*;

class TamGiac {
    private int a, b, c;

    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void Xuat() {
        System.out.println("Ba canh tam giac: " + a + " " + b + " " + c);
    }

    public int ChuVi() {
        return (a + b + c);
    }

    public float DienTich() {
        float p = (float) (a + b + c) / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void Loai() {
        if (a == b && b == c) {
            System.out.println("Tam giac deu.");
        } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
            System.out.println("Tam giac vuong.");
        } else if (a == b || b == c || a == c) {
            System.out.println("Tam giac can.");
        } else {
            System.out.println("Tam giac thuong.");
        }
    }
}