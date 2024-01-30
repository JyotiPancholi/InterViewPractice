package java_array.com;

//Program to left rotate the elements of an array
public class ArrayExercise3 {

	public static void main(String[] args) {
		int arr[] = new int[]{1,2,3,4,5};
		  System.out.println("Original array: ");  
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		for (int i = 0; i <3; i++) {
			int j,first;
			first = arr[0];//1
			for (j = 0; j < arr.length-1; j++) {
				arr[j] = arr[j+1];//2,3,4,5
				}
			 //First element of array will be added to the end  
				arr[j] = first;
		}
		System.out.println();
		 //Displays resulting array after rotation  
        System.out.println("Array after left rotation: ");  
        for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+" ");
		}
	}
}
