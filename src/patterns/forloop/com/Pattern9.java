package patterns.forloop.com;

public class Pattern9 {

	public static void main(String[] args) {
		for (int i=1;i<10;i++) {
			if(i%2==1) {
			for (int k=10;k>i;k--) {
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
			}
		  }System.out.println();
			
		}
	}
}
