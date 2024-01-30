package patterns.forloop.com;

public class Pattern55 {

	public static void main(String[] args) {
//		int x,y;
//		for (int i = 1; i <=7; i++) {
//			if (i%2==0) {
//				x=1;
//				y=0;
//			} else {
//				x=0;
//				y=1;
//			}
//			for (int j = 1; j <=i; j++) {
//				if (j%2==0) {
//					System.out.print(x+" ");
//				} else {
//					System.out.print(y+" ");
//				}
//			}System.out.println();
//		}
		
		for (int i = 1; i <=7; i++) {
			for (int j = i; j >=1; j--) {
				System.out.print((j%2)+" ");
			}System.out.println();
		}
	}
}
