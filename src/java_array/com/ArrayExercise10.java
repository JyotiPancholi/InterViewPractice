package java_array.com;

//Program to print the smallest element in an array

public class ArrayExercise10 {

	public static void main(String[] args) {
		int arr[] = new int[] {23,54,12,45,24,67,11};
		int min=arr[0];
		System.out.println("minimum number amoung the elemnts of array");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min  = arr[i];
			}
		}System.out.println(min);
	}
}
