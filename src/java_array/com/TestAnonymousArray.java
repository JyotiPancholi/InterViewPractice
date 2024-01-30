package java_array.com;
//ex-5
public class TestAnonymousArray {
	static void printarray(int arr[]) 
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		printarray(new int[]{12,23,34,45,56,67});
	}

}
