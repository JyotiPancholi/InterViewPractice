package thiskeyword.java.com;
//program where this keyword is not required
//incomplete output ..class test is given in online exmple
public class ThisNotRequired {
	int rollno;  
	String name;  
	float fee;  
	ThisNotRequired(int r,String n,float f){  
	rollno=r;  
	name=n;  
	fee=f;  
	}  
	void display(){System.out.println(rollno+" "+name+" "+fee);}  
//}
//class Test{
public static void main(String args[]){  
	ThisNotRequired s1=new ThisNotRequired(111,"ankit",5000f);  
	ThisNotRequired s2=new ThisNotRequired(112,"sumit",6000f);  
	s1.display();  
	s2.display();  
	}
}  