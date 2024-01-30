//Understanding the problem without this keyword

package thiskeyword.java.com;
public class WithoutThis {
	int rollno;  
	String name;  
	float fee;  
	WithoutThis(int rollno,String name,float fee){  
	rollno=rollno;  
	name=name;  
	fee=fee;  
	}  
	void display(){System.out.println(rollno+" "+name+" "+fee);}  

	public static void main(String args[]){  
		WithoutThis s1=new WithoutThis(111,"ankit",5000f);  
		WithoutThis s2=new WithoutThis(112,"sumit",6000f);  
	s1.display();  
	s2.display();  
	}
}  