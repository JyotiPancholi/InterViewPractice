package java_array.com;
//Java Program to find the frequency of odd & even numbers in the given matrix
public class ArrayExercise32 {

	public static void main(String[] args) {
		int rows,cols;
		int countOdd=0,countEven=0;
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		rows = a.length;
		cols = a[0].length;
		for (int i = 0; i <rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (a[i][j]%2==0) {
					countEven++;
				} else {
					countOdd++;
				}
			}
		}
		System.out.println("frequency of even numbers : "+countEven);
		System.out.println("frequency of odd numbers : "+countOdd);
	}
}
