package multithreading.com;
//Example - 33
class ThreadNew5 extends Thread  
	{   
	ThreadNew5(String tName, ThreadGroup tgrp)  
	{  
		super(tgrp, tName);  
		start();  
	}  
		public void run()  
		{  
			for (int j = 0; j < 100; j++)  
			{  
				try  
				{  
					Thread.sleep(5);  
				}  
				catch (InterruptedException e)  
				{  
					System.out.println("The exception has been encountered " + e);  
				}    
			}   
		System.out.println(Thread.currentThread().getName() + " thread has finished executing");  
	}  
}  
  
public class VoidIinterrupt {

	public static void main(String argvs[]) throws SecurityException, InterruptedException  
	{  
	// creating the thread group  
	ThreadGroup tg = new ThreadGroup("the parent group");  
	  
	ThreadGroup tg1 = new ThreadGroup(tg, "the child group");  
	  
	ThreadNew5 th1 = new ThreadNew5("the first", tg);  
	System.out.println("Starting the first");  
	  
	ThreadNew5 th2 = new ThreadNew5("the second", tg);  
	System.out.println("Starting the second");  
	  
	// invoking the interrupt method  
	tg.interrupt();  
	  
	}
}
