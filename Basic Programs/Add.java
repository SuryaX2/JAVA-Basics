import java.util.*;

class Add {
    public static void main(String as[]) {
        int a, b, c;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the 1st no. = ");
        a = ob.nextInt();
        System.out.print("Enter the 2nd no. = ");
        b = ob.nextInt();
        c = a + b;
        System.out.println("Addition = " + c);
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.print("Division = " + (a / b));
        ob.close();
    }
}