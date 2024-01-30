package multithreading.com;
//Example - 26
public class ExampleThreadGroup implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		ExampleThreadGroup r =  new ExampleThreadGroup();
		ThreadGroup tg =  new ThreadGroup("parent thread group");
		Thread t1 =  new Thread(tg,r,"one");
		t1.start();
		Thread t2 =  new Thread(tg,r,"two");
		t2.start();
		Thread t3 =  new Thread(tg,r,"three");
		t3.start();
		
		System.out.println("thread group name : "+tg.getName());
		tg.list();
	}
}
