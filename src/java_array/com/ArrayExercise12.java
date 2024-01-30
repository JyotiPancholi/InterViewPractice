package java_array.com;
//Java Program to print the sum of all the items of the array
public class ArrayExercise12 {

	public static void main(String[] args) {
		int arr[] = new int [] {12,23,34,45,56,67};
		int count=0;
		System.out.println("sum of all elemments present in array is :");
		for (int i = 0; i < arr.length; i++) {
			count+=arr[i];
		}System.out.println(count);
	}
}
