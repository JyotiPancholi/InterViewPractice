package test_polymorphism.com;

//A virtual function for which we are not required implementation
//is considered as pure virtual function. For example, Abstract 
//method in Java is a pure virtual function. 

abstract class Animal {  
    final void bark(){  
    System.out.println("Dog");  
    }  
    abstract void jump(); // Abstract Method (Pure Virtual Function)  
}  
class MyPet extends Animal{  
    void jump(){  
    System.out.println("MyPet is so sweet");  
    }  
}  
public class PureVirtualfun {

	public static void main(String[] args) {
		  Animal ob1 = new MyPet();  
	        ob1.jump();  
	}

}
