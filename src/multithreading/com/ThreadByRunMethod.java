package multithreading.com;
//https://www.javatpoint.com/what-if-we-call-java-run-method-directly
//What if we call Java run() method directly instead start() method?
// example = 10
public class ThreadByRunMethod extends Thread{
	@Override
	public void run() {
		System.out.println("running ....");
	}
	public static void main(String[] args) {
	ThreadByRunMethod t =  new ThreadByRunMethod();
	t.run();
	}
}
/*
 Discription :-  
 
when we call run() method as thread it wont be called as a thread but just 
as a method and hance it will execute the current call stack in place of 
rather then beginning of new call stack.
                       also when we call start method then JVM internally calls
the run() method hence we don't need to call run method.
						if we want to execute all the threads simulteneously then
we need to call start() method instead of run()method
*/