package test_recursion.com;

class Test{
	int fact(int n)
	{
		int result;
		if (n==1) {
			return 1;
		}
		result = fact(n-1)*n;
		return result;
		
	}
}
public class Factorial {

	public static void main(String[] args) {
	  Test t = new Test();
       System.out.println("factorual of 3 = "+t.fact(3));
       System.out.println("factorial of 5 = "+t.fact(5));
	}

}
