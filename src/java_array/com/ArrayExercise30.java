package java_array.com;
//Java Program to display the lower triangular matrix

public class ArrayExercise30 {

	public static void main(String[] args) {
		int raws,cols;
		int a[][]={{1,2,3},{8, 6, 4}, {4, 5, 6}};
		raws = a.length;
		cols = a[0].length;
		if (raws!=cols) {
			System.out.println("Matrix is not square matrix");
		} else {
			for (int i = 0; i < raws; i++) {
				for (int j = 0; j < cols; j++) {
					if (j>i) {
						System.out.print("0 ");
					}else {
						System.out.print(a[i][j]+" ");
					}
				}System.out.println();
			}
		}
	}
}
