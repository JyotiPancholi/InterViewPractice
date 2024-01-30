package patterns.forloop.com;

public class Pattern23 {

	public static void main(String[] args) {
		int alpha =65;
		for (int i = 5; i >=1; i--) {
			for (int j = 1; j < i; j++) {
			System.out.print(" ");	
			}
			for (int k = i; k <=5 ; k++) {
				System.out.print((char)(alpha+k-1)+" ");
			}System.out.println();
		}
	}

}
