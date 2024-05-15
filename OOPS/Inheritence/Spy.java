//multi level inheritance
import java.util.Scanner;
class Palin
{
   public int n,x,s=0;
   public void input()
   {
     Scanner ob =new Scanner(System.in);
     System.out.print("Enter the No. = ");
     n = ob.nextInt();
     ob.close();
   }
   public boolean check_palin()
   {
      for(x=n;n>0;n/=10)
       {
          s=(s*10)+(n%10);
       }
       n=x;
       if(s==x)
         return true;
       else
         return false;
   } 
}
class Arm extends Palin
{
  public int c=0;
   public boolean check_arm()
   {
      s=0;
      for(;n>0;n/=10)
        c++;
      for(n=x;n>0;n/=10)
       {
          s=s+(int)Math.pow((double)n%10,(double)c);
       }
       n=x;
       if(s==x)
         return true;
       else
         return false;
   }
}
class Spy extends Arm
{
   public int p=1;
   public void check_spy()
    {
       s=0;
       for(;n>0;n/=10)
        {
           s+=n%10;
           p*=n%10;
        }
        if(s==p)
          System.out.println(x+" is Spy No. ");
        else
          System.out.println(x+" is NOT Spy No. "); 

    }
   public static void main(String as[])
   {
     Spy ob =new Spy();
     ob.input();
     if(ob.check_palin()==true)
       System.out.println(ob.x+" is Palindrome No. ");
     else
       System.out.println(ob.x+" is NOT Palindrome No. "); 
     if(ob.check_arm()==true)
       System.out.println(ob.x+" is Armstrong No. ");
     else
       System.out.println(ob.x+" is NOT Armstrong No. "); 
     ob.check_spy();
   }
}