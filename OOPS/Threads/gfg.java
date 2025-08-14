import java.lang.*; 

public class gfg extends ThreadQuestion
{  
	public void run() 
	{  
			ThreadQuestion t=ThreadQuestion.currentThread();
      		System.out.println("status: "+t.isAlive());
			t.join();
      		System.out.println("status: "+t.isAlive());
	} 
	public static void main(String[] args) throws Exception 
	{ 
		gfg t = new gfg(); 
		t.start(); 
		System.out.println("status: "+t.isAlive());
	} 
}