package multithreading.com;
//Example -16

public class NamingThreadandCurrentThread1  extends Thread{  
	  public void run(){  
		   System.out.println("running...");  
		  }  
	public static void main(String[] args) {
		NamingThreadandCurrentThread1 t1 =  new  NamingThreadandCurrentThread1();
		NamingThreadandCurrentThread1 t2 = new NamingThreadandCurrentThread1();
		System.out.println("Name of t1:"+t1.getName());  
		System.out.println("Name of t2:"+t2.getName()); 
		t1.start();
		t2.start();
        t1.setName("jyoti pancholi");  
		System.out.println("After changing name of t1:"+t1.getName());  
	}
}
