package testabstract.com;

interface In1 {
 final int a = 10;
 void display();
}
public class Interface1 implements In1{
	@Override
	public void display() {
		System.out.println("hello everyone ! ");
	}

	public static void main(String[] args) {
		Interface1 i = new Interface1();
		i.display();
		System.out.println(a);
	}

	
}
