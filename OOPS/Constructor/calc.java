class test {
    double l, w, h;

    test(double length, double width, double height) {
        l = length;
        w = width;
        h = height;
    }

    void show() {
        System.out.println("Volume of the Box : " + l * w * h);
    }
}

public class calc {
    public static void main(String[] args) {
        test ob = new test(5, 5, 5);
        ob.show();
    }
}
