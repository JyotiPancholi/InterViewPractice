package multithreading.com;
//Example - 30

class ThreadNew2 extends Thread  
	{  
	ThreadNew2(String tName, ThreadGroup tgrp)  
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
  
public class EnumerateExample   
{  
public static void main(String argvs[]) throws SecurityException, InterruptedException  
	{  
	ThreadGroup tg = new ThreadGroup("the parent group");  
  
	ThreadGroup tg1 = new ThreadGroup(tg, "the child group");  
  
	ThreadNew2 th1 = new ThreadNew2("the first", tg);  
	System.out.println("Starting the first");  
  
	ThreadNew2 th2 = new ThreadNew2("the second", tg);  
	System.out.println("Starting the second");  
  
	// returning the number of threads kept in this array  
	Thread[] grp = new Thread[tg.activeCount()];  
	int cnt = tg.enumerate(grp);  
	for (int j = 0; j < cnt; j++)   
		{  
		System.out.println("Thread " + grp[j].getName() + " is found.");  
		}
	}
}
