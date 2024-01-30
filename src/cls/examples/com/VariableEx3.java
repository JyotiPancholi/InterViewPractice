package cls.examples.com;

//Object Initialization through a constructor
public class VariableEx3 {
	int id;
	String name;
	float salary;

	void insert(int i, String n, float s) {
		id = i;
		name = n;
		salary = s;
	}

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}

	public static void main(String[] args) {
		VariableEx3 e1 = new VariableEx3();
		VariableEx3 e2 = new VariableEx3();
		VariableEx3 e3 = new VariableEx3();
		e1.insert(123, "jiya", 1200000);
		e2.insert(234, "vaidharvi", 3400000);
		e3.insert(345, "jyoti", 6700000);
		e1.display();
		e2.display();
		e3.display();

	}

}
