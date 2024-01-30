// There are three ways to compare String in Java:
//By Using equals() Method
//By Using == Operator
//By compareTo() Method

package stringpractice.java.com;

public class JavaStringCompare {
//	1) By Using equals() Method
	public static void main(String[] args) {
		  String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   String s4="Saurav";  
		   System.out.println(s1.equals(s2));//true  
		   System.out.println(s1.equals(s3));//true  
		   System.out.println(s1.equals(s4));//false 
		   
		   String s5="Sachin";  
		   String s6="SACHIN";  
		  
		   System.out.println(s5.equals(s6));//false  
		   System.out.println(s5.equalsIgnoreCase(s6));//true  
	}
}
