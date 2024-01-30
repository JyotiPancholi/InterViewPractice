package controlstatement.java.com;

import java.util.Scanner;

public class JavaSwitchStatement {
 
	public static void main(String[] args) {
	 Scanner sc =new Scanner(System.in);
	 System.out.println("enter your choice :");
	 int a = sc.nextInt();
	  switch(a)
	   {
	  case 1:
		  System.out.println("you entered 1 ");
		  break;
	  case 2:
		  System.out.println("you entered 2 ");
		  break ;
	  case 3:
		  System.out.println("you entered 3 ");
		  break;
	  case 4:
		  System.out.println("you entered 4 ");
		  break;
	  case 5:
		  System.out.println("you entered 5 ");
		  break;
	  default:
		  System.out.println("you entered wrong choice !");
	    }
	}
}
