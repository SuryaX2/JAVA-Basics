import java.util.*;
interface Area {
    double pi = 3.14;
    void area();
}

class cir implements Area {
    double r;
    cir() {
        Scanner s = new Scanner(System.in);
        r = s.nextDouble();
    }
    public void area() {
        System.out.println("Area of Circle : "+ pi*r*r);
    }
}
class squ implements Area {
    double a;
    squ() {
        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
    }
    public void area() {
        System.out.println("Area of Circle : "+ pi*r*r);
    }
}
class inter {
    public static void main(String[] args) {
        
    }
}
