package patterns.forloop.com;
//incomplete
public class Pattern59 {

	public static void main(String args[]) {
		int cn =1,count;
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=i; j++) {
			 for (int k = cn+1; k <=50; k++) {//k=3
				 cn=k;//cn=2,3
				 count=0;//0
				 for (int l = 1; l <=k; l++) {
					if (cn%l==0) {
						count++;
					}
				}
				 if (count==2) {
					System.out.print(cn+" ");
				}
		     }
	      }
	   }
	}
}
