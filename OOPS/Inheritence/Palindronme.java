// Function Override Between Palindrome and reverse with "show" Function name.

import java.util.Scanner;

class Reverse {
    public void show(int n) {
        int rem, s = 0;
        for (int x = n; x > 0; x /= 10) {
            rem = x % 10;
            s = (s * 10) + rem;
        }
        System.out.println("Reversed Number Is : " + s);
    }
}

public class Palindronme {
    public void show(int n) {
        int rem, s = 0;
        for (int x = n; x > 0; x /= 10) {
            rem = x % 10;
            s = (s * 10) + rem;
        }
        if (s == n)
            System.out.println(n + " is a Palindrome Number");
        else
            System.out.println(n + " is Not a Palindrome Number");

    }

    public static void main(String as[]) {
        Scanner sc = new Scanner(System.in);
        Palindronme p = new Palindronme();
        System.out.println("\nEnter Your Number : ");
        int n = sc.nextInt();
        p.show(n);
        sc.close();
    }
}
