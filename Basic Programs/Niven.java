import java.util.*;
public class Niven {
    public void check(int n) {
        int r, s = 0;
        for (int x = n; x > 0; x /= 10) {
            r = x % 10;
            s += r;
        }
        if (n % s == 0)
            System.out.println("Its a Niven No.");
        else
            System.out.println("Its Not a Niven No.");
    }
    public static void main(String as[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int n = sc.nextInt();
        Niven ni = new Niven();
        ni.check(n);
        sc.close();
    }
}
