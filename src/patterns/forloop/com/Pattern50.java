package patterns.forloop.com;

public class Pattern50 {
	
	public static void main(String[] args) {
//		for (int i = 2; i <=6; i++) {
//			int n=i;
//			for (int j = 1; j <=5; j++) {
//			System.out.print(n+" ");
//			n++;
//			}System.out.println();
//		}
		
		 for(int i=2;i<=6;i++)
		  {
		   for(int j=i;j<=i+4;j++)
		   {
		   System.out.print(j+" ");
		   }System.out.println();
		}
	}
}
