import java.util.Scanner;
public class TwistedPrime {
    public boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int reverse(int n) {
        int rev = 0, r;
        for (int x = n; x > 0; x /= 10) {
            r = x % 10;
            rev = (rev * 10) + r;
        }
        return rev;
    }
    public static void main(String as[]) {
        Scanner sc = new Scanner(System.in);
        TwistedPrime tp = new TwistedPrime();
        System.out.print("Enter Your Number : ");
        int n = sc.nextInt();
        if (tp.isPrime(n)) {
            int x = tp.reverse(n);
            if (tp.isPrime(x))
                System.out.print("Its A Twisted Prime Number");
            else
                System.out.println("Its NOT A Twisted Prime Number");
        } else
            System.out.print("Input is Not Prime");
        sc.close();
    }
}
