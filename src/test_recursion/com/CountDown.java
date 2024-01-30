package test_recursion.com;

//Write a countDown(int number) method in Java using Recursion which prints
//countdown till zero to console, like count(3) should print 3 2 1 0

public class CountDown {

	public static void countDown(int number) 
	{
		if (number==0) {
			System.out.println(number);
		} else {
			System.out.println(number);
			countDown(number-1);
		}
	}
	public static void main(String[] args) {
		 CountDown cd =  new CountDown();
		 cd.countDown(5);
	}
}
