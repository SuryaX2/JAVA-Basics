import java.util.*;
class A
{
   public int a,b,c;
   public void input()
   {
      Scanner ob =new Scanner(System.in);
      System.out.print("Enter the 1st No. = ");
      a=ob.nextInt();
      System.out.print("Enter the 2nd No. = ");
      b = ob.nextInt();
      ob.close();
   }
   public void add()
    {
      c=a+b;
    }
}
class B extends A
{
   int sub;
   public void subtract()
    {
      sub=a-b;
    }
   public void display()
   {
      System.out.println("Addition = "+c);
      System.out.println("Subtraction = "+sub);
   }
   public static void main(String as[])
    {
      B ob =new B();
      ob.input();
      ob.add();
      ob.subtract();
      ob.display();
    }
}




