package multithreading.com;
//https://www.javatpoint.com/can-we-start-a-thread-twice
//Example - 9
public class StartThreaTwice extends Thread{
	@Override
	public void run() {
		System.out.println("thread is running");
	}
	public static void main(String[] args) {
		StartThreaTwice stt  = new StartThreaTwice();
		stt.start();
		stt.start();
	}
}
//output
//Exception in thread "main" thread is running
//java.lang.IllegalThreadStateException