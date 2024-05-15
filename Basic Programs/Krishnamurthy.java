import java.util.*;

class Krishnamurthy {
   int x, rem, s = 0, j, f = 1;

   public int check(int n) {
      for (x = n; n > 0; n /= 10) {
         rem = n % 10;
         for (j = 1; j <= rem; j++)
            f = f * j;
         s += f;
         f = 1;
      }
      return s;
   }

   public static void main(String as[]) {
      Scanner ob = new Scanner(System.in);
      System.out.print("Enter the No. = ");
      int n = ob.nextInt();
      Krishnamurthy ob2 = new Krishnamurthy();
      if (ob2.check(n) == ob2.x)
         System.out.print(n + " is Krishnamurthy No. ");
      else
         System.out.print(n + " is NOT Krishnamurthy No. ");
      ob.close();
   }
}