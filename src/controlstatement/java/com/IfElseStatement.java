package controlstatement.java.com;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) throws Exception{
	try {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value :");
		int a = sc.nextInt();
		System.out.println("enter secound value :");
		int b =  sc.nextInt();
		if(a<b){
			System.out.println("b is greater");
		}else {
			System.out.println("a is greater");
		}
	} catch (Exception e) {
		System.out.println("incorrect input found");
	    }
	}

}
