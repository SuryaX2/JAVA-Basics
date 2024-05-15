
//multiple inheritance
import java.io.*;

class A {
   public int ar, pr, len, b;

   public void calc() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter the Length & Breadth = ");
      len = Integer.parseInt(br.readLine());
      b = Integer.parseInt(br.readLine());
      ar = len * b;
      pr = 2 * (len + b);
   }
}

class B {
   public int ar1, pr1, s;

   public void calc1() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter the Side = ");
      s = Integer.parseInt(br.readLine());
      ar1 = s * s;
      pr1 = 4 * s;
   }

}

interface Circ {
   public final double pi = 3.14;

   public void calc2();
}

class C extends A implements Circ {
   public double ar2, pr2, r;

   public void input() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter the Radius = ");
      r = Double.parseDouble(br.readLine());
   }

   public void calc2() {
      ar2 = pi * r * r;
      pr2 = 2 * pi * r;
   }

   public void show() {
      System.out.println("Area of Rect = " + ar + "\nPerimeter of rect = " + pr);
      System.out.println("Area of Circ. = " + ar2 + "\nPerimeter of Circ. = " + pr2);
   }

   public static void main(String as[]) throws IOException {
      C ob = new C();
      ob.calc();
      ob.input();
      ob.calc2();
      ob.show();
      B obj = new B();
      obj.calc1();
      System.out.println("Area of Sq. = " + obj.ar1 + "\nPerimeter of Sq. = " + obj.pr1);
   }
}