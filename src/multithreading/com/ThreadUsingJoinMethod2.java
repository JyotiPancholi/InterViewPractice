package multithreading.com;
//Example -12
class ABCD extends Thread{
	Thread threadToInterrupt;  
	@Override
	public void run() {
		threadToInterrupt.interrupt();
	}
}
public class ThreadUsingJoinMethod2 {

	public static void main(String[] args) {
		try {
			ABCD t =  new ABCD();
			t.threadToInterrupt = Thread.currentThread();
			t.start();
			t.join();
		} catch (Exception e) {
			System.out.println("The exception has been caught. " + e);  
		}
	}
}

//The exception has been caught. java.lang.InterruptedException