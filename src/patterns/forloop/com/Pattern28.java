package patterns.forloop.com;

public class Pattern28 {

	public static void main(String[] args) {
		int alpha = 65;
		for (int i = 1; i <=5; i++) {//5
		 	for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
		 		 int var=1;
		 	for (int k = 1; k <= i ; k++) {// k = 1,2,3
				System.out.print((char)(alpha-1+var)+" ");//
				var = var*(i-k)/(k);//1*(5-1)/1 = 4
									//4*(5-2)/2 = 6
			}System.out.println();
		}
	}

}

//    A
//   A A 
//  A B A
// A C C A
//A D F