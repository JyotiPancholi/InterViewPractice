package multithreading.com;
//Example -21
public class TestIllegalArgumentException  extends Thread   
{  
	public static void main(String argvs[])  
	{  
	Thread.currentThread().setPriority(17);  
	System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
	}
}


//output =   java.lang.IllegalArgumentException