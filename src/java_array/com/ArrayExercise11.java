package java_array.com;
//Java Program to print the number of elements present in an array
public class ArrayExercise11 {

	public static void main(String[] args) {
		int arr[] = new int[] {12,34,12,3,4,57};
		int count=0;
		System.out.println("number of elements available in array is : ");
		for (int i = 0; i < arr.length; i++) {
			count++;
		}
	System.out.println(count);
	}
}
