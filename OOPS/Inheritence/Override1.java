import java.io.*;
class Override
{
   public void show()
    {
      System.out.println("Hi i'm parent Class");
    }
   public void calc(int x,int y)
    {
       System.out.println("Perimeter of Rect. = "+(2*(x+y)));
    }
}
class Override1 extends Override
{
   public void calc(int x,int y)
    {
       System.out.println("Area of Rect. = "+(x*y));       
    }
   public static void main(String as[])throws IOException
   {
     InputStreamReader ir=new InputStreamReader(System.in);
     BufferedReader br= new BufferedReader(ir);
     System.out.print("Enter the Length = ");
     int len=Integer.parseInt(br.readLine());
     System.out.print("Enter the Breadth = ");
     int b=Integer.parseInt(br.readLine());
     Override1 ob =new Override1();
     //Override ob =new Override();
     ob.show();
     ob.calc(len,b);
   }
}