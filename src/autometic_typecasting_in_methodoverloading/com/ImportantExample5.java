package autometic_typecasting_in_methodoverloading.com;

public class ImportantExample5 {

	 public void m1(int i) 
	  { 
	     System.out.println("Hello"); 
	  } 
	 public void m1(float f) 
	 { 
	    System.out.println("Java"); 
	  } 
	public static void main(String[] args) 
	 { 
		ImportantExample5 t = new ImportantExample5(); 
	      t.m1(10); 
	      t.m1(10.5f); 
	      t.m1('a'); 
	      t.m1(10l); 
	   // t.m1(10.5); // Compile time error. 
	}

}
