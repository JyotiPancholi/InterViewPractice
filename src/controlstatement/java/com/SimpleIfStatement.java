package controlstatement.java.com;

import java.util.Scanner;

public class SimpleIfStatement {

	public static void main(String[] args) {
	try {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter first value :");
		int a = sc.nextInt();
		System.out.println("enter second value :");
		int b = sc.nextInt();
		if(a<b)
		{
			System.out.println("b is greater ");
		}
		if(b<a)
		{
		System.out.println("a is greater");
		}
		} catch (Exception e) {
			System.out.println("input mismatch !");
		}
	}

}
