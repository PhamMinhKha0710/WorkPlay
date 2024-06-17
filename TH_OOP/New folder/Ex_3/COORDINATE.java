package Ex_3;

class COORDINATE {
    private int x, y;

    public COORDINATE() {
        x = 0;
        y = 0;
    }

    public COORDINATE(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int Tong(COORDINATE p) {
        return (this.x + p.x + this.y + p.y);
    }

    public COORDINATE DoiXung() {
        return new COORDINATE(-this.x, -this.y);
    }

    public void Xuat() {
        System.out.println("(" + x + ";" + y + ")");
    }
}
