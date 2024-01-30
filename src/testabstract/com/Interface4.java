package testabstract.com;
//static method allow in interface it can be called directly withour creating object of subclass
interface Interfac
{
    final int a = 10;
    static void display()
    {
        System.out.println("hello");
    }
}
  
public class Interface4 implements Interfac{

	public static void main(String[] args) {
		 Interfac.display();
	}

}
