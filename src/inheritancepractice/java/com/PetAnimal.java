//Hierarchical Inheritance Example

package inheritancepractice.java.com;

public class PetAnimal {
	void eat() {
		System.out.println("eating ..!");
	}

	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
//		c.bark();  //c.t. error
		c.bite();
	}
}

class Tomy extends PetAnimal {
	void bark() {
		System.out.println("barking ..!");
	}
}

class Cat extends PetAnimal {
	void bite() {
		System.out.println("cat bite ..!");
	}
}
