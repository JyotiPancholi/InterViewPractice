 package patterns.forloop.com;

public class Pattern11 {

	public static void main(String[] args) {
		int alpha = 65;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print((char)(alpha+i-1)+" ");
			}System.out.println("\n");
		}
	}

}
