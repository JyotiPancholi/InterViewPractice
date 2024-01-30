package test_polymorphism.com;
//Java Runtime Polymorphism with Multilevel Inheritance

class Animals{  
void eat(){System.out.println("eating");}  
}  
class Doggy extends Animals{  
void eat(){System.out.println("eating fruits");}  
}  
public class BabyDog extends Doggy{  
	void eat(){System.out.println("drinking milk");}  
	public static void main(String args[]){  
	Animals a1,a2,a3;  
	a1=new Animals();  
	a2=new Doggy();  
	a3=new BabyDog();  
	a1.eat();  
	a2.eat();  
	a3.eat();  
	}
}
