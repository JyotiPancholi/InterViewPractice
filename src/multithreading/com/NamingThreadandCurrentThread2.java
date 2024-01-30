package multithreading.com;

//Example of naming a thread : Without Using setName() Method
//Example -17

class Test extends Thread
{
	Test(String test){
		super(test);
	}
public void run()  
{  
System.out.println(" The thread is executing....");  
}  
}  
public class NamingThreadandCurrentThread2 
{
	
	public static void main(String[] args) {
		// creating two threads and settting their name  
		// using the contructor of the class  
		Test th1 = new Test("JavaTpoint1");  
		Test th2 = new Test("JavaTpoint2");  
		  
		// invoking the getName() method to get the names  
		// of the thread created above  
		System.out.println("Thread - 1: " + th1.getName());  
		System.out.println("Thread - 2: " + th2.getName());  
		  
		  
		// invoking the start() method on both the threads  
		th1.start();  
		th2.start();
	}
}
