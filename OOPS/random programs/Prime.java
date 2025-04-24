import java.util.Scanner;

class NotPrimeException extends Exception {
    public String toString() {
        return "NotPrimeException: The number is not prime.";
    }
}

public class Prime {

    public static boolean isPrime(int n) throws NotPrimeException {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                throw new NotPrimeException();
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int n = sc.nextInt();
        try {
            if (isPrime(n)) {
                System.out.println(n + " is a prime number.");
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }

}
