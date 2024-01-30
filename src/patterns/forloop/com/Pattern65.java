package patterns.forloop.com;

public class Pattern65 {

	public static void main(String[] args) {
		int n = 5;  // Number of rows.
//	      n = n/2 + 1;
	      int i=0;
	      for(i=0;i<n;i++)
	      {
	          for(int k=0;k<i;k++)
	          System.out.print("  ");
	          for(int j=i;j<n;j++)
	          {
	        	  if (!(i==4 || i==1)) {
		            System.out.print("* ");
	        	  }		            
	          }
	          System.out.println();
	      }
	      n=i;  // i=n so copy its value to n.
	      int m=2;
	      for(i=0;i<4;i++)
	      {
	          for(int k=i;k<3;k++)
	          System.out.print("  ");
	          for(int j=0;j<m;j++)
	          {
	            System.out.print("* ");
	          }
	          m++;
	          System.out.println();
	      }
	}
}
