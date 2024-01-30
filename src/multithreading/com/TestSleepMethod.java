package multithreading.com;
//https://www.javatpoint.com/thread-sleep-in-java
//Example of the sleep() method in Java : on the custom thread
//Example - 6
public class TestSleepMethod extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 5 ; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			System.out.println(e);
		}System.out.println(i);
	}
}
	public static void main(String[] args) {
		TestSleepMethod t1 = new TestSleepMethod();
		TestSleepMethod t2 = new TestSleepMethod();
		t1.start();
		t2.start();
	}
}
