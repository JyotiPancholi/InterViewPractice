//Write a Java program that reads a floating-point number and prints "zero" if the number
//is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value 
//of the number is less than 1, or "large" if it exceeds 1,000,000.

package controlstatement.java.com;

import java.util.Scanner;

public class IfElseExerciseQuestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number : ");
		double n = sc.nextDouble();
		
		if(n>0)
		{
			if(n<1) 
			{
				System.out.println("positive small number !");
			}
			else if(n>1000000)
			{
				System.out.println("positive large number !");
			}
			else 
			{
				System.out.println("positive number !");
			}
		}
		else if(n<0)
		{
			if(Math.abs(n)<1) 
			{
				System.out.println("Negative small number");
			}
			else if(Math.abs(n)>1000000)
			{
				System.out.println("Negative large number");
			}
			else 
			{
				System.out.println("Negative  number");	
			}
		}
		else
		{
			System.out.println("number is zero !");
		}
	}
}
