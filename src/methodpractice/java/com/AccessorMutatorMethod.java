//There are two types of instance method:
//Accessor Method
//Mutator Method
//https://www.javatpoint.com/method-in-java
package methodpractice.java.com;

public class AccessorMutatorMethod {
private int rollno;
private String name;
//getter method
public int getrollno() 
{
return rollno;
}
public void setRollno(int rno) 
{
	this.rollno=rno; 
}
public String getName()   
{  
return name;  
}  
public void setName(String name)   
{  
this.name = name;  
}  
void display() 
{
System.out.println(rollno+" "+name);	
}
	public static void main(String[] args) {
		AccessorMutatorMethod a = new AccessorMutatorMethod();
		a.display();
	}

}
