package cls.examples.com;

//Object and Class Example: Initialization through method
public class VariableEx2 {
	int rollno;
	String name;

	void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}

	void displayInformation() {
		System.out.println(rollno + " " + name);
	}

	public static void main(String[] args) {
		VariableEx2 s1 = new VariableEx2();
		VariableEx2 s2 = new VariableEx2();
		s1.insertRecord(111, "Karan");
		s2.insertRecord(222, "Aryan");
		s1.displayInformation();
		s2.displayInformation();
	}

}