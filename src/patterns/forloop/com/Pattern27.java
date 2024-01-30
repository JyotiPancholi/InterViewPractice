package patterns.forloop.com;

public class Pattern27 {

	public static void main(String[] args) {
		int alpha =65;
		for (int i = 1; i <= 5; i++) {
			for (int k = 5; k >=i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				if(j==1 || i==j ) 
				{
					System.out.print((char)alpha+" ");
				}
				else
				{
					System.out.print((char)(alpha+i-2)+" ");
					
				}
			}System.out.println();
		}
	}

}
