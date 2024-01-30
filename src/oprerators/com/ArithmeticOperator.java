package oprerators.com;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter fisrt number - ");
		int a = sc.nextInt();
		System.out.println("enter second number - ");
		int b = sc.nextInt();
		System.out.println(a+b); 
		System.out.println(a-b);  
		System.out.println(a*b);  
		System.out.println(a/b);  
		System.out.println(a%b);  
		
		System.out.println(10*10/5+3-1*4/2);  
	}

}
