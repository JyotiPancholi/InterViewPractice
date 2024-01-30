package autometic_typecasting_in_methodoverloading.com;
//https://www.scientecheasy.com/2020/07/type-promotion-method-overloading-java.html

public class Example1 {
	
	  static void m1(double a) 
	  { 
	    System.out.println("double-arg"); 
	  } 
	 static void m1(int a) 
	 { 
	    System.out.println("int-arg"); 
	 } 
	public static void main(String[] args) 
	{ 
	 m1(2); // Exact match is found because 2 is an integer data type. So, output is int-arg. 
	 m1(1.5f); // Exact match is found because 1.5f is an float data type. So, output is double-arg. 
	}
}
