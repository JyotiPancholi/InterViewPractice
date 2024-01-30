package oprerators.com;

import java.util.Scanner;

public class AssignmentOpr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x :- ");
		int x = sc.nextInt();
		System.out.println("enter the value of y :- ");
		int y = sc.nextInt();
		x+=y;
		x-=y;
		x/=y;
		x%=y;
//------------------------------------------------------
		short a=10;  
		short b=10;  
		//a+=b;//a=a+b internally so fine  
		//a=a+b;//Compile time error because 10+10=20 now int  
		//solution
		a=(short)(a+b);//20 which is int now converted to short 
		System.out.println(a);  
	}

}
