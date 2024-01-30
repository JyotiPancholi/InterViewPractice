package java_array.com;
//Passing Array to a Method in Java
//ex-4
public class ArrayToMethod {

	static void min(int arr[]) 
	{
	int min = arr[0];	
	for (int i = 1; i < arr.length; i++) 
		if (min>arr[i]) 
			min=arr[i];
			System.out.println(min);
		}
	public static void main(String[] args) {
		int a[] = {34,52,36,78};
		min(a);
	}
}
