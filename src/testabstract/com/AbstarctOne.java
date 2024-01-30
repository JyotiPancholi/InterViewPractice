package testabstract.com;

abstract class Animal
{
	 public abstract void animalSound();//abstract method
	 	public void sleep() {
	    System.out.println("Zzz");
    }
}
class Pig extends Animal
{
	@Override
	public void animalSound() {
		System.out.println("pig says wee wee");		
	}
	
}
public class AbstarctOne {

	public static void main(String[] args) {
		Pig p =  new Pig();
		p.animalSound();
		p.sleep();
	}

}
