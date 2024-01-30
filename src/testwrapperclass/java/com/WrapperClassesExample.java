package testwrapperclass.java.com;

//Java Program to convert all primitives into its corresponding   
//wrapper objects and vice-versa  

public class WrapperClassesExample {

	public static void main(String[] args) {
		byte    b  =     123; 
		short   s  =     45;
		int     i  =     456;
		long    l  =     563;
		char    c  =     'r';
		boolean bl  =     true;
		float   f  = 	 4563.09f;
		double  d  =     7353;
		
		//Autoboxing: Converting primitives into objects  
		Byte b1 = b;
		Short s1 = s;
		Integer i1 = i;
		Long l1 = l;
		Character c1 = c;
		Boolean bl1 = bl;
		Float  f1 =  f;
		Double d1 = d ;
		
//		printing objects
		System.out.println("---Printing object values---");
		System.out.println("Byte object      = "+b1 );
		System.out.println("Short object     = "+s1);
		System.out.println("Integer object   = "+i1);
		System.out.println("Long object      = "+l1);
		System.out.println("Character object = "+c1);
		System.out.println("Boolean object   = "+bl1);
		System.out.println("Float object     = "+f1);
		System.out.println("Double object    = "+d1);
		

//		Unboxing: Converting Objects to Primitives  
		byte byt = b1;
		short srt = s1;
		int ii = i1;
		long lng = l1;
		char ch  = c1;
		boolean bln = bl1;
		float ft = f1;
		double dbl = d1;
		
//	    Printing primitives 
		System.out.println();
		System.out.println("---Printing primitive values---");  
		System.out.println("byte value        : "+byt);  
		System.out.println("short value       : "+srt);  
		System.out.println("int value         : "+ii);  
		System.out.println("long value        : "+lng);  
		System.out.println("float value       : "+ft);  
		System.out.println("double value      : "+dbl);  
		System.out.println("char value        : "+ch);  
		System.out.println("boolean value     : "+bln);  
		
	}
}
