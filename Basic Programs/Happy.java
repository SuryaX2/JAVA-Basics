import java.util.*;

class Happy {
    public boolean check(int n) {
        int rem, sq, s = 0;
        for (int x = n; x > 0; x = x / 10) {
            rem = x % 10;
            sq = rem * rem;
            s += sq;
        }
        while (s != 1) {
            int temp = 0;
            for (int x = s; x > 0; x = x / 10) {
                rem = x % 10;
                sq = rem * rem;
                temp += sq;
            }
            s = temp;
        }

        if (s == 1)
            return true;
        else
            return false;
    }

    public static void main(String as[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Your Number : ");
        int n = sc.nextInt();
        Happy ob = new Happy();
        if (ob.check(n) == true)
            System.out.println("Its Happy No.");
        else
            System.out.println("Its Not Happy No.");
        sc.close();
    }
}