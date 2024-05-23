package OOPS.AbstractClass;
abstract class Area {
    double l, b;
    abstract void area();
}
class tri extends Area {
    tri(double x,double y) {
        l = x;
        b = y;
    }
    void area() {
        System.out.println("Area of Triangle : "+(l*b)/2);
    }
}
class rect extends Area {
    rect(double x,double y) {
        l = x;
        b = y;
    }
    void area() {
        System.out.println("Area of Rectangle : "+l*b);
    }
}
public class abs {
    public static void main(String[] args) {
        tri t = new tri(5, 5);
    }
}
