
//WAp to check whether a no. is pronic or not
import java.util.*;

class Pronic {
  public static int x, i;

  public boolean check(int n) {
    for (i = 1; i <= n; i++) {
      if (i * (i + 1) == n) {
        return true;
      }
    }
    return false;
  }

  public static void main(String as[]) {
    Scanner ob = new Scanner(System.in);
    System.out.print("Enter the No. = ");
    x = ob.nextInt();
    Pronic obj = new Pronic();
    if (obj.check(x) == true)
      System.out.print(x + " Pronic No.");
    else
      System.out.print(x + " NOT Pronic No.");
    ob.close();
  }
}