package java_array.com;
//ex=10 .... What is the class name of Java array?
public class TestArray4 {

	public static void main(String[] args) {
		//declaration and initialization of array  
		int arr[]={4,4,5};  
		//getting the class name of Java array  
		Class c=arr.getClass();  
		String name=c.getName();  
		//printing the class name of Java array   
		System.out.println(name);  
	}
}
