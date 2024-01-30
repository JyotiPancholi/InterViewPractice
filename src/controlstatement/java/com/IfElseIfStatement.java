package controlstatement.java.com;

import java.util.Scanner;

public class IfElseIfStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value : ");
		int a = sc.nextInt();
		System.out.println("enter 2nd value :");
		int b =sc.nextInt();
		if(a<b) {
			System.out.println("b is greater !");
		}
		else if(b<a){
			System.out.println("a is greater");
		}
		else{
			System.out.println("both values are equal");
		}
	}

}
