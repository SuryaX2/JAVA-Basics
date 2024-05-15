class Room {
    double l, b;
    Room(double x, double y) {
        l = x;
        b = y;
    }
    void area() {
        System.out.println("\nArea : " + (l * b));
    }
}
class Bedroom extends Room {
    double d;
    Bedroom(double x, double y, double z) {
        super(x, y);
        d = z;
    }
    void volume() {
        System.out.println("\nVolume : " + (l * b * d));
    }
    public static void main(String[] args) {
        Bedroom b = new Bedroom(5, 5, 5);
        b.area();
        b.volume();
    }
}