package patterns.forloop.com;

public class Pattern60 {

	public static void main(String[] args) {
		 int m;
		  for(int i=1; i<=5; i++)
		  {
		   m = i;
		   for(int j=1; j<=i; j++)
		    System.out.print(m++);
		   m = m - 2;
		   for(int k=1; k<i; k++)
		    System.out.print(m--);
		   System.out.println();
		  }
	}
}
