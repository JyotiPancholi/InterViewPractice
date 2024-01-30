package test_recursion.com;

//Write a Java program to calculate the power of a number like 
//power(int number, int power) like power(2, 3) should return 8?

public class ResultNumbersPower {
	public static long power(int x, int y) 
	{ 
		long result = x; 
		for (int i = 1; i < y; i++)
		  {
			result = result * x;
		  } 
		return result; 
	}

	public static void main(String[] args) {
		System.out.println("2 to the power 3 : = " + power(2, 3)); 
		System.out.println("3 to the power 3 : = " + power(3, 3)); 
		System.out.println("2 to the power 5 : = " + power(2, 5));
		System.out.println("5 to the power 2 : = " + power(5, 2));
		System.out.println("9 to the power 2 : = " + power(9, 2));
	}
}
