package testcallbyvalue.callbyrefrnc.com;


class Test
{
    void math(int i, int j)
    {
        i = i * 2;
        j = j / 2;
        
        System.out.println("\nThe value of a and b in method after performing action :");
        System.out.println("a = " + i + "\t b = " + j);
    }
}
public class TestCallbyValue1 {

	public static void main(String[] args) {
		 
        Test obj = new Test();
        
        int a = 150, b = 200;
        
        System.out.println("The value of a and b before call :");
        System.out.println("a = " + a + "\t b = " + b);
        
        obj.math(a, b);
        
        System.out.println("\nThe value of a and b after call : ");
        System.out.println("a = " + a + "\t b = " + b);
	}

}
