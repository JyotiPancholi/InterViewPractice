package methodpractice.java.com;
//example for user defined mewthod
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number :=");
	int num = sc.nextInt();
	findEvenOdd(num);  
	}

	private static void findEvenOdd(int num) {
		{  
		//method body  
		if(num%2==0)   
		System.out.println(num+" is even");   
		else   
		System.out.println(num+" is odd");  
		}  
	}  
}
