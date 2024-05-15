import java.util.*;

class Karpekar {
  int x, s = 0, a, b, c = 0, sq;

  public boolean check(int n) {
    for (x = n; n > 0; n = n / 10)
      c++;
    sq = x * x;
    a = (int) Math.pow((double) 10, (double) c);
    b = sq % a;
    int p = sq / a;
    if (x == b + p)
      return true;
    else
      return false;
  }

  public static void main(String as[]) {
    Scanner ob = new Scanner(System.in);
    System.out.print("Enter the No. = ");
    int n = ob.nextInt();
    Karpekar obj = new Karpekar();
    if (obj.check(n))
      System.out.print(n + " is Karpekar No. ");
    else
      System.out.print(n + " is NOT Karpekar No. ");
    ob.close();
  }
}