package multithreading.com;
//example -34
class ThreadNew6 extends Thread  
{  
// constructor of the class  
ThreadNew6(String tName, ThreadGroup tgrp)  
{  
super(tgrp, tName);  
start();  
}  
  
// overriding the run() method  
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
public class Test_boolean_isDaemon {

	public static void main(String argvs[]) throws SecurityException, InterruptedException  
	{  
	// creating the thread group  
	ThreadGroup tg = new ThreadGroup("the parent group");  
	  
	ThreadGroup tg1 = new ThreadGroup(tg, "the child group");  
	  
	ThreadNew6 th1 = new ThreadNew6("the first", tg);  
	System.out.println("Starting the first");  
	  
	ThreadNew6 th2 = new ThreadNew6("the second", tg);  
	System.out.println("Starting the second");  
	  
	if (tg.isDaemon() == true)  
	{  
	System.out.println("The group is a daemon group.");  
	}  
	else  
	{  
	System.out.println("The group is not a daemon group.");  
	}  
	}
}
