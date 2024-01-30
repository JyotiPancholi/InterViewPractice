package stringpractice.java.com;

public class TestStringMethods {

	public static void main(String[] args) {
//		 method - lenght()
		 String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	     System.out.println("The length of the txt string is: " + txt1.length());
//		 method - toUpperCase(),toLowerCase() 
	     String txt2 = "Hello World";
	     System.out.println(txt2.toUpperCase());
	     System.out.println(txt2.toLowerCase());
//	     Finding a Character in a String :- indexOf()
	     String txt = "Please locate where 'locate' occurs!";
	     System.out.println(txt.indexOf("locate"));
//	     All String Methods
//	     https://www.w3schools.com/java/java_ref_string.asp
	     
	}
}
