package controlstatement.java.com;

import java.util.Scanner;

public class CheckRactangleOrSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the lenght -");
		int l = sc.nextInt();
		System.out.println("enter the breadth");
		int b = sc.nextInt();
		if(l==b) 
		{
			System.out.println("its an square ");
		}
		else 
		{
			System.out.println("its a ractangle ");

		}
   }
}
