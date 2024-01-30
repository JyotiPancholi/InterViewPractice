package java_array.com;

//Program to print the elements of an array present on odd position
public class ArrayExercise8 {

	public static void main(String[] args) {
		int arr[]  =  new int[] {1,2,3,4,5,6,7};
		System.out.println("elements of odd index of array");
		for (int i = 0; i < arr.length; i=i+2) {
			System.out.println(arr[i]);
		}
	}
}
