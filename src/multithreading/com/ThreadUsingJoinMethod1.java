package multithreading.com;
//Example - 12

class TestMe extends Thread{
		@Override
		public void run() {
			for (int i = 0; i < 2; i++) {
				try {
					Thread.sleep(300);
					System.out.println("Current thread name :  "+Thread.currentThread().getName());
				} catch (Exception e) {
					System.out.println("exeption arrived is : "+e);
				}System.out.println(i);
			}
		}
}
public class ThreadUsingJoinMethod1{
	public static void main(String[] args) {
		TestMe t1 =new TestMe();
		TestMe t2 =new TestMe();
		TestMe t3 =new TestMe();
		t1.start();
		try {
			System.out.println("current thread name is : "+Thread.currentThread().getName());
			t1.join();
		}catch (Exception e) {
			System.out.println("The exception has been caught " + e);  
		}
		t2.start();
		try {
			System.out.println("current thread name is : "+Thread.currentThread().getName());
			t2.join();
		}catch (Exception e) {
			System.out.println("The exception has been caught " + e);  
		}
		t3.start();
	}
}
