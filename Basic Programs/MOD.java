import java.util.*;

class MOD {
    public void multi(int n) {
        int r, m = 1;
        for (int x = n; x > 0; x /= 10) {
            r = x % 10;
            m = m * r;
        }
        System.out.println("Multiply of Digit is : " + m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int n = sc.nextInt();
        MOD m = new MOD();
        m.multi(n);
        sc.close();
    }
}
