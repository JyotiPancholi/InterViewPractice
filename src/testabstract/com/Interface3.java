package testabstract.com;

interface Interfc
{
    final int a = 10;
    default void display()
    {
        System.out.println("hello");
    }
}
public class Interface3 implements Interfc{

	public static void main(String[] args) {
		        Interface3 t = new Interface3();
		        t.display();
	}

}
