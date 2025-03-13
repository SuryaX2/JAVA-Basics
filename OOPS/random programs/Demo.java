class Demo {
    static int pow(int a, int b) {
        int p = 1;
        for (int i = 1; i <= b; i++) {
            p = p * a;
        }
        return p;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int rem, p, s = 0, c = 0;
        for (int x = n; x > 0; x /= 10) {
            c++;
        }
        for (int x = n; x > 0; x /= 10) {
            rem = x % 10;
            p = pow(rem, c);
            s += p;
        }
        if (s == n)
            System.out.print(n + " is Armstrong no.");
        else
            System.out.print(n + " is NOT Armstrong no.");
    }
}
