package patterns.forloop.com;

public class Pattern26 {

	public static void main(String[] args) {
		int alpha = 65;
		for (int i = 5; i >=1; i--) {
			for (int j = i; j >=1; j--) {
				System.out.print((char)(alpha+j-1)+" ");
			}System.out.println();
		}
	}

}
