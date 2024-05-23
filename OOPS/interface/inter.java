import java.util.*;
interface Area {
    double pi = 3.14;
    void area();
}
class cir implements Area {
    cir() {
        Scanner s=new Scanner(System.in);
        double r = s.nextDouble();
    }
    void area() {
        System.out.println("Area of Circle");
    }
}
class squ implements Area {
    squ() {
        
    }
    void area() {
        
    }
}
class inter {
    public static void main(String[] args) {
        
    }
}
