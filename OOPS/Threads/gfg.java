import java.lang.*; 

public class gfg extends Thread
{  
	public void run() 
	{  
			Thread t=Thread.currentThread();
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