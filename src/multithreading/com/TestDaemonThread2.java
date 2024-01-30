package multithreading.com;
//Example - 23
public class TestDaemonThread2 extends Thread {
	@Override
	public void run() {
		System.out.println("name : "+Thread.currentThread().getName());
		System.out.println("Daemon : "+Thread.currentThread().isDaemon());
	}
	public static void main(String[] args) {
		TestDaemonThread2 t1 = new TestDaemonThread2();
		TestDaemonThread2 t2 = new TestDaemonThread2();
		t1.start();
		t1.setDaemon(true);
		t2.start();
	}
}

/*
o/p -
Exception in thread "main" name : Thread-0
Daemon : false
java.lang.IllegalThreadStateException
*/