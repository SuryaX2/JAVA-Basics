class Parent
{
   public final int a=10;
   public void show()
    {
      //a+=5;
      System.out.println("Data = "+a);
    }
}
class Child
{
   public static void main(String as[])
    {
       Parent ob =new Parent();
       ob.show();
    }
}