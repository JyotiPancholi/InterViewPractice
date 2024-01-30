package java_array.com;
//Java Program to multiply two matrices

public class ArrayExercise23 {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int c[][]= new int[3][3];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j]=0;
				for (int k = 0; k < c.length; k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");  //printing matrix element
			}
		  System.out.println();//new line    
		}
	}
}
