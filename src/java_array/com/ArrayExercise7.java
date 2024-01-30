package java_array.com;

//Program to print the elements of an array in reverse order
public class ArrayExercise7 {

	public static void main(String[] args) {
		int arr[] = new int [] {1,2,3,4,5};
		System.out.println("elements before reversing : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
    	System.out.println("array in reverse order");
    	for (int i = arr.length-1; i >=0; i--) {
			System.out.println(arr[i]);
		}
	}
}
