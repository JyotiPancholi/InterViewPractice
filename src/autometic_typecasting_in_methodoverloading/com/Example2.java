package autometic_typecasting_in_methodoverloading.com;

public class Example2 {
	 public void m1(double a) 
	  { 
	     System.out.println(a*a); 
	  } 
	public void m1(float a) 
	{ 
	   System.out.println(a*a); 
	 } 
	public static void main(String[] args) 
	{ 
		Example2 t = new Example2(); 
	     t.m1(2); // Exact match is not found for passing argument 2 because 2 is an integer data type.
    } 
}