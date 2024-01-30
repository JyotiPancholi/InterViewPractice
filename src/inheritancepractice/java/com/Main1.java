package inheritancepractice.java.com;

class Animals{
	String name;
	public void eat() {System.out.println("i can eat !");}
}
class Dogg extends Animals{
	public void display() {
		System.out.println("the name is - "+name);
	}
}

public class Main1 {

	public static void main(String[] args) {
		Dogg d = new Dogg();
		d.name="olvin";
		d.display();
		d.eat();
	}

}
