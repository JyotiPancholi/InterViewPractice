//Write a Java program that reads in two floating-point numbers and tests whether they 
//are the same up to three decimal places.

package controlstatement.java.com;

import java.util.Scanner;

public class IfElseEx4 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter first floating-point value : ");
	 double f1 = sc.nextDouble();
	 System.out.println("enter second floating-point value : ");
	 double f2 = sc.nextDouble();
	 
	 f1 = Math.round(f1 * 1000);
     f1 = f2 / 1000;

     f2 = Math.round(f2 * 1000);
     f2 = f2/ 1000;
     
     if (f1 == f2)
         System.out.println("They are the same up to three decimal places");
     else
         System.out.println("They are different");
   }
}
