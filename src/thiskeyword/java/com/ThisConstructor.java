package thiskeyword.java.com;
//Real usage of this() constructor call
public class ThisConstructor {
int rollno;
String name, course;
float fee;
public ThisConstructor(int rollno, String name, String course) {
	this.rollno = rollno;
	this.name = name;
	this.course = course;
}
public ThisConstructor(int rollno, String name, String course, float fee) {
	this.rollno = rollno;
	this.name = name;
	this.course = course;
	this.fee = fee;
}
void display() 
{
System.out.println(rollno+" "+name+" "+course+" "+fee);	
}
public static void main(String[] args) {
	ThisConstructor s1 =  new ThisConstructor(111, "shanvi", "java");
	ThisConstructor s2 =  new ThisConstructor(222, "jyoti","dbms", 776480);
	s1.display();
	s2.display();
}
}
