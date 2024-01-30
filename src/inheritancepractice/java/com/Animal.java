//Single Inheritance Example
package inheritancepractice.java.com;

public class Animal {
	void eat() {
		System.out.println("eating...!\n");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking..!");
	}
}
