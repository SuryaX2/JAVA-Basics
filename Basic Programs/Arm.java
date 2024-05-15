import java.util.*;

class Arm {
   public int c = 0, a, rem, s = 0, p;

   public void check(int n) {
      for (a = n; n > 0; n /= 10)
         c++;
      for (n = a; n > 0; n /= 10) {
         rem = n % 10;
         p = (int) Math.pow((double) rem, (double) c);
         s += p;
      }
      if (s == a)
         System.out.print("No. " + a + " is Armstrong no.");
      else
         System.out.print("No. " + a + " is NOT Armstrong no.");
   }

   public static void main(String as[]) {
      Scanner ob = new Scanner(System.in);
      System.out.print("Enter the No. = ");
      int x = ob.nextInt();
      Arm obj = new Arm();
      obj.check(x);
      ob.close();
   }
}