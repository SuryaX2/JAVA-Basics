import java.util.*;

public class Palindrome {
    int n, x, r, s = 0;

    public int palin(int n) {
        for (x = n; x > 0; x = x / 10) {
            r = x % 10;
            s = (s * 10) + r;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        Palindrome p = new Palindrome();
        System.out.println("Enter Your Number : ");
        p.n = ob.nextInt();
        if (p.n == p.palin(p.n))
            System.out.println(p.n + " Is a Palindrome Number !");
        else
            System.out.println(p.n + " Is Not a Palindrome Number !");
        ob.close();
    }
}
