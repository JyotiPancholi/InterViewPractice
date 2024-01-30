//Write a program in Java to input 5 numbers from keyboard and find their sum and average

package controlstatement.java.com;

import java.util.Scanner;

public class ExForSumAndAverage {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter any 5 numbers :");
		int n=0,sum=0;
		double avg;
		{
			   
	        System.out.println("Input the 5 numbers : ");  
	         
		}
		for (int i=0;i<5;i++)
		{
		    Scanner in = new Scanner(System.in);
		    n = in.nextInt();
		    
  		    sum +=n;
	    }
			avg=sum/5;
			System.out.println("The sum of 5 no is : " +sum+"\nThe Average is : " +avg);
 
	}

}
