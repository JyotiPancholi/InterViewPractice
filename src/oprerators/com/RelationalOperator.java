package oprerators.com;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a :- ");
		int a = sc.nextInt();
		System.out.println("enter the value of b :- ");
		int b = sc.nextInt();
		// value of a and b
	    System.out.println("a is " + a + " and b is " + b);

	    // == operator
	    System.out.println(a == b);  

	    // != operator
	    System.out.println(a != b);  
	    
	    // > operator
	    System.out.println(a > b);

	    // < operator
	    System.out.println(a < b);  

	    // >= operator
	    System.out.println(a >= b); 

	    // <= operator
	    System.out.println(a <= b);  
	}

}
