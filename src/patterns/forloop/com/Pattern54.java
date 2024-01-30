package patterns.forloop.com;

public class Pattern54 {

	public static void main(String[] args) {
		int k=1,l=0;
		for (int i = 1; i <=7; i++) {
			for (int j = 1; j <=i; j++) {
				if (j%2==1) {
					System.out.print(k+" ");
				} else {
					System.out.print(l+" ");
				}
				//System.out.print("*");
			}System.out.println();
		}
//		for (int i = 1; i <=7; i++) {
//			for (int j = 1; j <=i; j++) {
//				System.out.print((j%2)+" ");
//			}System.out.println();
//		}
	}

}
