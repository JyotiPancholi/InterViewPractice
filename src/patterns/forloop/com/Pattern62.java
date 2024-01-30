package patterns.forloop.com;

public class Pattern62 {

	public static void main(String[] args) {
		System.out.println("0");
		for(int i=1; i<=5; i++)
	    {
	        System.out.print("0");
	        for(int j=1; j<=i; j++)
	        {
	            System.out.print(""+j);
	        }

	        for(int j=i-1; j>=1; j--)
	        {
	            System.out.print(""+j);
	        }
	        System.out.print("0");
	        System.out.println();
	    }
	}
}		