package java_array.com;
//Program to copy all elements of one array into another array

public class ArrayExercise1 {

	public static void main(String[] args) {
		int arr1[] = new int [] {1,2,3,4,5};
		int []arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i]=arr1[i];
		}
		 //Displaying elements of array arr1     
        System.out.println("Elements of original array: ");  
        for (int j = 0; j < arr1.length; j++) {
			System.out.print(arr1[j]+" ");
		}System.out.println();
		//Displaying elements of array arr2     
        System.out.println("Elements of new array: ");    
        for (int l = 0; l < arr2.length; l++) {
			System.out.print(arr2[l]+" ");
		}
	}
}
