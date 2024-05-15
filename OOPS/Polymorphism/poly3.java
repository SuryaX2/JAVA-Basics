class Box {
    double l, b, w;
    Box(double l) {
        this.l = this.b = this.w = l;
    }
    Box(double l, double b, double w) {
        this.l = l;
        this.b = b;
        this.w = w;
    }
    double volume() {
        return l * b * w;
    }
}
public class poly3 {
    public static void main(String[] args) {
        Box cube = new Box(5);
        System.out.println("The volume of the cube is:" + cube.volume());
        Box rectangle = new Box(10, 12.5, 14.9);
        System. out.println("The volume of the rectangle is:" + rectangle.volume());
    }
}
