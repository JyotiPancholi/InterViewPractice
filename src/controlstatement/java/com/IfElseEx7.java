//A company decided to give bonus of 5% to employee if his/her year of service is more 
//than 5 years.Ask user for their salary and year of service & print the net bonus amoun.

package controlstatement.java.com;

import java.util.Scanner;

public class IfElseEx7 {

	public static void main(String[] args) {
		double discountedSalary;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your salary : ");
		Double s = sc.nextDouble();
		System.out.println("enter years of service : ");
		int ys = sc.nextInt();
		
		if(ys>=5) 
		{
			discountedSalary = (5.0/100)*s;
			s+=discountedSalary;
			System.out.println("your bonum amount is : "+discountedSalary);
			System.out.println("your Salary including Bonus is : "+s);
		}else
		{
		 System.out.println("You are not eligible for bonus !");	
		}
	}

}
