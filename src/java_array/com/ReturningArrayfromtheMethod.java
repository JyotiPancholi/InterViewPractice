package java_array.com;
//ex-6
//Returning Array from the Method

public class ReturningArrayfromtheMethod {
static int[]  get() 
{
	return new int[] {23,54,15,67,78};
	
}
	public static void main(String[] args) {
		//calling method which returns an array  
		int arr[] = get();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
