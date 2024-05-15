class C
{
   public final void show()
    {
      System.out.println("Hi Soham you are a Parent Class.");
    }
}
class D extends C
{
   public void show()
    {
      System.out.println("No Bro I'm Sahil a Child Class.");
    }
   public static void main(String as[])
    {
       D ob =new D();
       ob.show();
    }

}