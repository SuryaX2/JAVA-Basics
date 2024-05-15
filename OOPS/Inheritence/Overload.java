import java.io.*;

class Overload {
   public void calc(int x) {
      System.out.println("Area of sq. = " + (x * x));
   }

   public void calc(int x, int y) {
      System.out.println("Area of Rect. = " + (x * y));
   }

   public void calc(double r) {
      System.out.println("Area of Circ. = " + (/* Math.PI */3.14 * r * r));
   }

   public static void main(String as[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter the Side= ");
      int s = Integer.parseInt(br.readLine());
      Overload ob = new Overload();
      ob.calc(s); // This line need to stay in comment bcz of Function overload
      System.out.print("Enter the Length= ");
      int len = Integer.parseInt(br.readLine());
      System.out.print("Enter the Breadth= ");
      int b = Integer.parseInt(br.readLine());
      ob.calc(len, b);// This line need to stay in comment bcz of Function overload
      System.out.print("Enter the Radius= ");
      double r = Double.parseDouble(br.readLine());
      ob.calc(r);
   }
}