import java.util.*;

class StrComp1 {
  public boolean check(String x, String y) {
    if (x.equalsIgnoreCase(y))
      return true;
    else
      return false;

  }

  public static void main(String[] as) {
    Scanner ob = new Scanner(System.in);
    System.out.print("Enter the 1st String = ");
    String a = ob.nextLine();
    System.out.print("Enter the 2nd String = ");
    String b = ob.nextLine();
    StrComp1 obj = new StrComp1();
    if (obj.check(a, b))
      System.out.print("String Matched");
    else
      System.out.print("String NOT Matched");
    ob.close();
  }
}