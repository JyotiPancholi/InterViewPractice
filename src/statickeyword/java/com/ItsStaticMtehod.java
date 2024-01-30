package statickeyword.java.com;

public class ItsStaticMtehod {
int id ;
String name;
static String clg ="MIST";
static void change() 
{
clg ="Malwa-2";	
}
public ItsStaticMtehod(int id, String name) {
	this.id = id;
	this.name = name;
}
void display() 
{
System.out.println(id+" "+name+" "+clg);	
}
	public static void main(String[] args) {
		ItsStaticMtehod.change();
		ItsStaticMtehod s1 = new ItsStaticMtehod(111, "jiya");
		ItsStaticMtehod s2 = new ItsStaticMtehod(222, "jyoti");
		s1.display();
		s2.display();
	}
}
