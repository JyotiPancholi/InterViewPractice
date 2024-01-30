package test_polymorphism.com;

//The method that is called is determined during the execution of
//the program. Hence, method overriding is a run-time polymorphism.

class Language {
	  public void displayInfo() {
	    System.out.println("Common English Language");
	  }
	}

	class Java extends Language {
	  @Override
	  public void displayInfo() {
	    System.out.println("Java Programming Language");
	  }
	}

public class DynamicPolymorphysm3 {

	public static void main(String[] args) {
		 // create an object of Java class
	    Java j1 = new Java();
	    j1.displayInfo();

	    // create an object of Language class
	    Language l1 = new Language();
	    l1.displayInfo();
	}
}
