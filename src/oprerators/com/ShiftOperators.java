package oprerators.com;

import java.util.Scanner;

public class ShiftOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number to perform shifting :- ");
		int x = sc.nextInt();
		System.out.println("enter number of bits you want to shift :- ");
		int y = sc.nextInt();
		System.out.println("left shift :- "+(x<<y));  
		System.out.println("right shift :- "+(x>>y));  
		System.out.println("unsigned right shift :- "+(x>>>y));  
	}

}
