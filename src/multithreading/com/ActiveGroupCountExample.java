package multithreading.com;
//Example -28

class ThreadNeww extends Thread  
{  
	ThreadNeww(String tName, ThreadGroup tgrp)  
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
  
public class ActiveGroupCountExample  
{  
	public static void main(String argvs[])  
	{  
		ThreadGroup tg = new ThreadGroup("The parent group of threads");  
  
		ThreadGroup tg1 = new ThreadGroup(tg, "the child group");  
  
		ThreadNew th1 = new ThreadNew("the first", tg);  
		System.out.println("Starting the first");  
  
		ThreadNew th2 = new ThreadNew("the second", tg);  
		System.out.println("Starting the second");  
  
		System.out.println("The total number of active thread groups are: " + tg.activeGroupCount());  

	}
}
