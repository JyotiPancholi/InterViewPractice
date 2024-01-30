package statickeyword.java.com;

public class ItsStaticVariable1 {
int id;
String name;
static String collage = "MIST";

public ItsStaticVariable1(int id, String name) {
	this.id = id;
	this.name = name;
}
void display() 
{
System.out.println(id+" "+name+" "+collage);	
}
	public static void main(String[] args) {
		ItsStaticVariable1 sv1 = new ItsStaticVariable1(111, "jams");
		ItsStaticVariable1 sv2 = new ItsStaticVariable1(222,"jiya");
        sv1.display();
        sv2.display();
    }

}
