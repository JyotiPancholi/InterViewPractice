package stringpractice.java.com;
//		2) By Using == operator

public class ByUsingEqualstoOprator {

	public static void main(String[] args) {
		String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   System.out.println(s1==s2);//true (because both refer to same instance)  
		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
	
	}

}
