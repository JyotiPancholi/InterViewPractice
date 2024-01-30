package multithreading.com;
//Example -22

public class TestDaemonThread1 extends Thread{
	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread is working ..!");
		}else {
			System.out.println("user thread works");
		}
	}
	public static void main(String[] args) {
		TestDaemonThread1 t1 = new TestDaemonThread1();
		TestDaemonThread1 t2 = new TestDaemonThread1();
		TestDaemonThread1 t3 = new TestDaemonThread1();
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}
}
