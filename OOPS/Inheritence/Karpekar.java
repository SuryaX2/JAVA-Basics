//single level inheritance
import java.util.Scanner;
class Krish
{
  public int n,x,rem,s=0,f=1,j;
  public void input()
   {
      Scanner ob =new Scanner(System.in);
      System.out.print("Enter the No. = ");
      n=ob.nextInt();
      ob.close();
   }
  public boolean check()
  {
       for(x=n;n>0;n/=10)
       {
          rem=n%10;
          for(j=1;j<=rem;j++)
           {
              f=f*j;
           }
           s=s+f;
           f=1;
       }
       n=x;
       if(x==s)
         return true;
       else
         return false;
  }
}
class Karpekar extends Krish
{
   public int c=0,sq,p;
   public void check1()
    {
      s=0;
       for(;n>0;n/=10)
         {
            c++;
         }
       sq=x*x;
       p=(int)Math.pow((double)10,(double)c);
       rem=sq%p;
       s=sq/p;
       if(x==(s+rem))
         System.out.println(x+" is Karpekar No.");
       else
         System.out.println(x+" is NOT Karpekar No.");
    }
    public static void main(String as[])
     {
        Karpekar ob =new Karpekar();
        ob.input();
        if(ob.check())
         System.out.println(ob.x+" is Krishnamurthy No.");
        else
         System.out.println(ob.x+" is NOT Krishnamurthy No.");
        ob.check1();
     }
}




