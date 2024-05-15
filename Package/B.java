final class A
{
   public int a=10;
}
class B extends A
{
   public void show()
    {
      System.out.println("Data = "+a);
    }
   public static void main(String as[])
    {
       B ob =new B();
       ob.show();
    }
}