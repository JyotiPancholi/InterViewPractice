package test_recursion.com;

//program to print reverse of any string

public class TestReverseString {

	public static String reverseMe(String source) 
	{
		if (source ==null || source.isEmpty()) {
			return source;
		}
		String reverse = "";
		for (int i = source.length()-1; i >=0; i--) {
			reverse =reverse + source.charAt(i);
		}
		return reverse;
		
	}
	public static void main(String[] args) {
		TestReverseString rs =  new TestReverseString();
		String result = rs.reverseMe("jyoti");
		System.out.println(result);
	}
}
