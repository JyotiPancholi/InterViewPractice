package java_array.com;
//Java Program to add two matrices
public class ArrayExercise22 {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
		//creating another matrix to store the sum of two matrices    
		int c[][] = new int[3][3];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}System.out.println();
		}
	}
}
