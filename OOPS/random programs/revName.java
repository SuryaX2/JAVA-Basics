import java.util.Scanner;

public class revName {
    public static String rev(String name) {
        String[] names = name.split(" ");
        StringBuilder res = new StringBuilder();
        for (String n : names) {
            StringBuilder sb = new StringBuilder(n);
            res.append(sb.reverse()).append(" ");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        String res = rev(name);
        System.out.println(res);
        s.close();
    }
}
