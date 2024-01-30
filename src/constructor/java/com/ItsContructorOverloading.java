package constructor.java.com;

public class ItsContructorOverloading {
int id;
String name;
float salary;

	public ItsContructorOverloading(int i, String n) {
	this.id = i;
	this.name = n;
}

	public ItsContructorOverloading(int ii, String nn, float ss) {
	this.id = ii;
	this.name = nn;
	this.salary = ss;
}
	void display() 
	{
		System.out.println(id+" "+name+" "+salary);
	}

	public static void main(String[] args) {
		ItsContructorOverloading co1 = new ItsContructorOverloading(34, "jiya");
		ItsContructorOverloading co2 = new ItsContructorOverloading(35, "jyoti", 568990);
		co1.display();
		co2.display();
	}

}
