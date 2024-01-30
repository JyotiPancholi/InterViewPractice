package multithreading.com;
//https://www.javatpoint.com/how-to-create-a-thread-in-java
//Example - 4
public class UsingRunnable implements Runnable {
	public void run() {
		System.out.println("Thread is running !");
	}
	public static void main(String[] args) {
		UsingRunnable t =  new UsingRunnable();
		Thread t1 =  new Thread(t);
		t1.start();
	}
}
