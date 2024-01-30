package multithreading.com;
//Example-31
class ThreadNew3 extends Thread  
{  
	ThreadNew3(String tName, ThreadGroup tgrp)  
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
  
public class Test_getMaxPriority {

	public static void main(String[] args) throws SecurityException, InterruptedException  
	{  
		// creating the thread group  
		ThreadGroup tg = new ThreadGroup("the parent group");  
		  
		ThreadGroup tg1 = new ThreadGroup(tg, "the child group");  
		  
		ThreadNew3 th1 = new ThreadNew3("the first", tg);  
		System.out.println("Starting the first");  
		  
		ThreadNew3 th2 = new ThreadNew3("the second", tg);  
		System.out.println("Starting the second");  
		  
		int priority = tg.getMaxPriority();  
		  
		System.out.println("The maximum priority of the parent ThreadGroup: " + priority);  
		  
	}
}
