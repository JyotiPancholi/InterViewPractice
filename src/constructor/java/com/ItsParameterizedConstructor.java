package constructor.java.com;

public class ItsParameterizedConstructor {
int id;
String name;

public ItsParameterizedConstructor(int i, String n) {
	this.id = i;
	this.name = n;
}
void display() 
{
System.out.println(id+" "+name);	
}
	public static void main(String[] args) {
		ItsParameterizedConstructor pc1 = new ItsParameterizedConstructor(111, "jiya");
		ItsParameterizedConstructor pc2 = new ItsParameterizedConstructor(222, "jyoti");
		pc1.display();
		pc2.display();
	}

}
