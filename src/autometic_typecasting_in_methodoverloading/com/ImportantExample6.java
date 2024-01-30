package autometic_typecasting_in_methodoverloading.com;

public class ImportantExample6 {
	
	 public void m1(String s) 
	  { 
	     System.out.println("Hello"); 
	  } 
	public void m1(Object o) 
	{ 
	   System.out.println("Java");  
	 } 
	 public static void main(String[] args)
	 { 
		 ImportantExample6 t = new ImportantExample6(); 
	     t.m1(new Object()); // Exact match with object argument. 
	     t.m1("Deep"); // Exact match with string argument. 
	     t.m1(10); 
	     t.m1(10.5f); 
	     t.m1('a'); 
	     t.m1(null);
	}
}
