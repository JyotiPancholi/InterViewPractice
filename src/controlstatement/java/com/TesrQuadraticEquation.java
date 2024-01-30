package controlstatement.java.com;

import java.util.Scanner;

public class TesrQuadraticEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		double a = sc.nextDouble();
		System.out.println("enter the value of b");
		double b = sc.nextDouble();
		System.out.println("enter the value of c");
		double c = sc.nextDouble();
		double d = b*b-4.0*a*c;
		
		if(d>0) 
		{
			double r1 = (-b + Math.pow(d, 0.5))/(2.0*a);
			double r2 = (-b - Math.pow(d, 0.5))/(2.0*a);
            System.out.println("the roots are "+r1+" and "+r2);
		}
		else if(d==0)
		{
			double r1 = -b/(2.0*a);
			System.out.println("the root is "+r1);
		}
		else 
		{
		System.out.println("the equation has no real root !");	
		}

	}

}
