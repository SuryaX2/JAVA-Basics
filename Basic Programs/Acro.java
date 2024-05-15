
//input --> arpan shil --> A.S.
import java.util.*;

class Acro {
    public void acromatic(String x) {
        x = x.toUpperCase();
        System.out.println("String = " + x);
        x = " " + x;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ')
                System.out.print(x.charAt(i + 1) + ".");
        }
    }

    public static void main(String as[]) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the String = ");
        String a = ob.nextLine();
        Acro obj = new Acro();
        obj.acromatic(a);
        ob.close();
    }
}