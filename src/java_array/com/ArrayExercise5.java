package java_array.com;
//Program to print the elements of an array

//Arrays are the special variables that store multiple values under the 
//same name in the contiguous memory allocation. Elements of the array can be 
//accessed through their indexes.

public class ArrayExercise5 {

	public static void main(String[] args) {
		int arr[] =  new int[] {1,2,3,4,5};
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
