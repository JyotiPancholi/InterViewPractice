package multithreading.com;
//https://www.javatpoint.com/how-to-create-a-thread-in-java
//Using the Thread Class: Thread(Runnable r, String name)
//Example - 5
public class UsingThreadClassWith_Runnable_String implements Runnable{
	@Override
	public void run() {
	   System.out.println("The Thread is Running");
	}
	
	public static void main(String[] args) {
		Runnable r = new UsingThreadClassWith_Runnable_String(); 
		Thread t =  new Thread(r,"My new Thread !");
		t.start();
		String str = t.getName();
		System.out.println(str);
				
	}
}
