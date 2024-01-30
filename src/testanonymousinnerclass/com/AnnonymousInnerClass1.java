package testanonymousinnerclass.com;
//https://www.geeksforgeeks.org/anonymous-inner-class-java/

//Java program to demonstrate Need for
//Anonymous Inner class

//Interface
interface Age {
 int x = 21;
 void getAge();
}
//Helper class implementing methods of Age Interface
class MyClass implements Age {

 // Overriding getAge() method
 @Override public void getAge()
 {
     System.out.print("Age is " + x);
 }
}
//Annonymous Demo
public class AnnonymousInnerClass1 {

	public static void main(String[] args) {

        // Class 1 is implementation class of Age interface
        MyClass obj = new MyClass();
 
        // calling getage() method implemented at Class1
        // inside main() method
        obj.getAge();
	}

}

//go toAnnonymousInnerClass2