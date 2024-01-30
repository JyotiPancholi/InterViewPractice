package test_polymorphism.com;

class ProgrammingLanguage {
	  public void display() {
	    System.out.println("I am Programming Language.");
	  }
	}

class JavaLanguage extends ProgrammingLanguage {
	  @Override
	  public void display() {
	    System.out.println("I am Object-Oriented Programming Language.");
	  }
	}
public class PolymorphicVarieble {

	public static void main(String[] args) {
		ProgrammingLanguage pl; // creating object variable
		pl = new ProgrammingLanguage();// create object of ProgrammingLanguage
		pl.display();
		pl =  new JavaLanguage();
		pl.display();
	}

}
