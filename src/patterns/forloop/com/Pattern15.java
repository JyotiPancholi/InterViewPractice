package patterns.forloop.com;

public class Pattern15 {

	public static void main(String[] args) {
		for (int i = 5; i>=1; i--) {
			for (int j = 5; j >=i; j--) {
			System.out.print(j+" ");	
			}
//			for (int k = 5; k<=5 ; k++) {
//			System.out.print(k+" ");	
			System.out.println();
		}
	}
}
