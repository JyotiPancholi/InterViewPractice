package testcallbyvalue.callbyrefrnc.com;

class TestMe
{
    int a, b;
    TestMe(int i, int j)
    {
        a = i;
        b = j;
    }
    /* pass an object */
    void meth(TestMe o)
    {
        o.a = o.a * 2;
        o.b = o.b / 2;
        System.out.println();
        System.out.println("in the call of method : a = "+o.a+" b = "+o.b );
    }
}
public class TestCallByReference1 {

	public static void main(String[] args) {
		TestMe obj = new TestMe(150, 200);
	        
	        int a = 150, b = 200;
	        
	        System.out.println("The value of obj.a and obj.b before call :");
	        System.out.println("obj.a = " + obj.a + "\t obj.b = " + obj.b);
	        
	        obj.meth(obj);
	        
	        System.out.println("\nThe value of obj.a and obj.b after call : ");
	        System.out.println("obj.a = " + obj.a + "\t obj.b = " + obj.b);
	}
}
