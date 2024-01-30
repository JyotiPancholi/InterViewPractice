package oprerators.com;

import java.util.Scanner;

public class LogicalAndBitwiseOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x :- ");
		int x = sc.nextInt();
		System.out.println("enter the value of y :- ");
		int y = sc.nextInt();
		if(x++==2 & ++y==2)  {
		    
			x =7;
		}
		System.out.println("x="+x+",y="+y);
//-----------------------------------------------------
		if(x++==2 && ++y==2){
		    
			x =7;
		}
		System.out.println("x="+x+",y="+y);
//-----------------------------------------------------		
		if(x++==1 | ++y==1){
		    
			x =7;
		}
		System.out.println("x="+x+",y="+y);
//-----------------------------------------------------
		if(x++==1 || ++y==1){
		    
		    x =7;
		}
		System.out.println("x="+x+",y="+y);
//-----------------------------------------------------
		//^  Two integer values are interchanged 
		int a=2,b=3;
		a=a^b;
		b=a^b;	//a^b^b b=a
		a=a^b; //a^b^a
//-----------------------------------------------------
	// some other examples for &&,&
		int p=12,q=34,r=23;
		System.out.println(p<q&&p<r);//
		System.out.println(p<q&p<r);//
		
		System.out.println(p<q && p++<r); 
		System.out.println(p);  
		System.out.println(p<q & p++<r);  
		System.out.println(p);
//-----------------------------------------------------
	//
		System.out.println(p>q||p<r);  
		System.out.println(p>q|p<r);  
		//|| vs |  
		System.out.println(p>q || p++<r); 
		System.out.println(p);  
		System.out.println(p>q | p++<r);  
		System.out.println(p); 
	}

}
