package autometic_typecasting_in_methodoverloading.com;

public class Example9 {

	public void add(int x) 
	  { 
	    System.out.println(x+x); 
	   } 
	public void add(int... x)
	{ 
	 // We can call this method by passing any int value including zero. 
	     System.out.println(x); 
	  } 
	public static void main(String[] args) 
	{ 
		Example9 s = new Example9(); 
	   s.add(0); // Exact matched. 
	   s.add(10); // Exact matched. 
	}

}
