package autometic_typecasting_in_methodoverloading.com;

public class Example4 {
	 public void m1(byte a) 
	  { 
	     System.out.println(a+a); 
	  } 
	 public void m1(short a) 
	 { 
	    System.out.println(a+a); 
	 } 
	public static void main(String[] args) 
	{ 
		Example4 t = new Example4(); 
//	    t.m1(10); // Exact match is not found because the method m1(byte) is not applicable for the argument (int). 
	
	}
}

//compile time error