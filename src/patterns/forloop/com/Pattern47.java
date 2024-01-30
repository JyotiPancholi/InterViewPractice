package patterns.forloop.com;

public class Pattern47 {

	public static void main(String[] args) {
		for (int i = 1; i <10; i++) {
			if (i%2==1)
			{
			for (int j = 10; j >i; j--) {
				System.out.print(" ");
			}	
			for (int k = 1; k<=i; k++) {
				System.out.print("* ");
			}
			}System.out.println();
		}
		
		for (int i = 8; i >=1; i--) {
			if (i%2==1) {
				for (int j = i; j<10 ; j++) {
					System.out.print(" ");
				}
				for (int k = i; k >=1; k--) {
					System.out.print("* ");
				}
			}System.out.println();
		}
	}
}
