import java.util.Scanner;

public class TwinPrime {
    public boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String as[]) {
        Scanner sc = new Scanner(System.in);
        TwinPrime tp = new TwinPrime();
        System.out.print("Enter Range : ");
        int n = sc.nextInt();
        System.out.println("Twin Prime Number Sets are : ");
        for (int i = 3; i <= n; i++) {
            if (tp.isPrime(i) && tp.isPrime(i + 2))
                System.out.println("(" + i + "," + (i + 2) + ")");
        }
        sc.close();
    }
}