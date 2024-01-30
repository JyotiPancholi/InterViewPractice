package testanonymousinnerclass.com;

interface MyAge {
    int x = 21;
    void getAge();
}
public class AnnonymousInnerClass2 {

	public static void main(String[] args) {
		// Myclass is hidden inner class of Age interface
        // whose name is not written but an object to it
        // is created.
		MyAge oj1 = new MyAge() {
           
            @Override public void getAge()
            {
                // printing  age
                System.out.print("Age is " + x);
            }
        };
        oj1.getAge();
	}
}
