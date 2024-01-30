package autometic_typecasting_in_methodoverloading.com;

public class Example8 {
	 public void add(int a, float b) 
	  { 
	     System.out.println(a+b); 
	  } 
	public void add(float b, int a) 
	{ 
	   System.out.println(a+b); 
	 } 
	public static void main(String[] args) 
	{ 
		Example8 s = new Example8(); 
	    s.add(10, 5.5f); // Exact matched. 
	    s.add(10.5f, 1); // Exact matched. 
	 // s.add(10, 10); // Ambiguous because both methods are matched. 10 is an int and can be promoted to float. 
	 // s.add(10.5f, 10.2f); // No matched. // Compile time error. 
	}

}
