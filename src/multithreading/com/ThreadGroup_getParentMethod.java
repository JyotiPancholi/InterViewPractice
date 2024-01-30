package multithreading.com;
//Example-31

class ThreadNew4 extends Thread  
	{  
     ThreadNew4(String tName, ThreadGroup tgrp)  
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
    			 System.out.println("The exception has been encountered" + e);  
    		 }  
    	 }  
  
    	 System.out.println(Thread.currentThread().getName() + " thread has finished executing");  
     }  
}  

public class ThreadGroup_getParentMethod {

		public static void main(String argvs[]) throws SecurityException, InterruptedException  
		{  
		// creating the thread group  
		ThreadGroup tg = new ThreadGroup("the parent group");  
		  
		ThreadGroup tg1 = new ThreadGroup(tg, "the child group");  
		  
		ThreadNew4 th1 = new ThreadNew4("the first", tg);  
		System.out.println("Starting the first");  
		  
		ThreadNew4 th2 = new ThreadNew4("the second", tg);  
		System.out.println("Starting the second");  
		  
		// printing the parent ThreadGroup   
		// of both child and parent threads  
		System.out.println("The ParentThreadGroup for " + tg.getName() + " is " + tg.getParent().getName());  
		System.out.println("The ParentThreadGroup for " + tg1.getName() + " is " + tg1.getParent().getName());  
		  
		  
	}
}
