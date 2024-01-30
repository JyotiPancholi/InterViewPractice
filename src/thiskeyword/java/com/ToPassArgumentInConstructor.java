//this: to pass as argument in the constructor call
//incomplete 
package thiskeyword.java.com;

public class ToPassArgumentInConstructor {
A4 obj;
ToPassArgumentInConstructor(A4 obj)
{
	this.obj=obj;
}
void display() 
{
System.out.println(obj.data);	
}
}
class A4
{
int data =10;
public A4() {
 ToPassArgumentInConstructor c = new ToPassArgumentInConstructor(this);
 c.display();
}

	public static void main(String[] args) {
		A4 a = new A4();
	}
}
