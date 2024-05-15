import java.util.*;

class Acro1 {
   public void acromatic(String x) {
      x = x.toUpperCase();
      System.out.println("String = " + x);
      System.out.print(x.charAt(0));
      int j = 0;
      for (int i = 1; i < x.length(); i++) {
         if (x.charAt(i) == ' ') {
            System.out.print("." + x.charAt(i + 1));
            j = i;
         }
      }
      x = x.toLowerCase();
      for (j = j + 2; j < x.length(); j++) {
         System.out.print(x.charAt(j));
      }
   }

   public static void main(String as[]) {
      Scanner ob = new Scanner(System.in);
      System.out.print("Enter the String = ");
      String a = ob.nextLine();
      Acro1 obj = new Acro1();
      obj.acromatic(a);
      ob.close();
   }
}