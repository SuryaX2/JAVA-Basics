import java.util.Scanner;

class A {
    private int a, b;

    A(int a, int b) {
        if (a > 0 && b > 0) {
            this.a = a;
            this.b = b;
        }
    }

    int findGCD() {
        int x = a;
        int y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        A obj = new A(a, b);
        System.out.println("GCD of a and b is: " + obj.findGCD());
        sc.close();
    }
}