package cls.examples.com;
//Object initialization By reference variable
public class VariableEx1 {
int id;
String name ;
}
class Test
{
public static void main(String[] args) {
		VariableEx1 x= new VariableEx1();
		x.id = 111;
		x.name = "Jiya";
		System.out.println(x.id+" "+x.name);
	}	
}
