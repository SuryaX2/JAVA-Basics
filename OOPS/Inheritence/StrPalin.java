import java.util.Scanner;

public class StrPalin {
    public boolean check(String str) {
        int i = 0, j = 0, f = 0;
        str = str.toLowerCase();
        j = str.length() - 1;
        for (i = 0; i <= j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                f = 1;
                break;
            }
        }
        if (f == 0)
            return true;
        else
            return false;
    }

    public static void main(String as[]) {
        StrPalin s = new StrPalin();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the String : ");
        String str = sc.nextLine();
        if (s.check(str))
            System.out.println(str + " is a Palindrome String");
        else
            System.out.println(str + " is not a Palindrome String");
        sc.close();
    }
}
