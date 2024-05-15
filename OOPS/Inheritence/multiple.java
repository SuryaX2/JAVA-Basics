import java.util.*;

class Rect {
    public int len, br, ar, pr;

    public void input() {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the Length = ");
        len = ob.nextInt();
        System.out.print("Enter the Breadth = ");
        br = ob.nextInt();
        ob.close();
    }

    public void calc() {
        ar = len * br;
        pr = 2 * (len + br);
    }
}

interface Circ {
    public final double pi = 3.14;

    public void input_circ();

    public void cir_area();

    public void cir_perimeter();
}

public class multiple extends Rect implements Circ {
    double r, ar1, pr1;

    public void input_circ() {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the Radius = ");
        r = ob.nextDouble();
        ob.close();
    }

    public void cir_area() {
        ar1 = pi * r * r;
    }

    public void cir_perimeter() {
        pr1 = 2 * pi * r;
    }

    public void display() {
        System.out.println("Area of Rect = " + ar + "\t Perimeter of Rect = " + pr);
        System.out.println("Area of Circ. = " + ar1 + "\t Perimeter of Circ. = " + pr1);
    }

    public static void main(String[] args) {
        multiple ob = new multiple();
        ob.input();
        ob.input_circ();
        ob.calc();
        ob.cir_area();
        ob.cir_perimeter();
        ob.display();
    }
}