import java.util.*;

class Pattern1 {
   public void show() {
      Scanner ob = new Scanner(System.in);
      System.out.print("Enter the Range = ");
      int n = ob.nextInt();
      for (int i = 1; i <= n; i++) {
         for (int j = i; j >= 1; j--)
            System.out.print(j + " ");
         System.out.println();
      }
      ob.close();
   }

   public static void main(String as[]) {
      Pattern1 ob = new Pattern1();
      ob.show();
   }

}