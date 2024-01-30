package test_polymorphism.com;

class A{
	public void show1(){
		System.out.println("class A");
	}
}
class B extends A{
	public void show2(){
		System.out.println("class B");
	}
}
public class Demo1 {

	public static void main(String[] args) {
	 A a = new B();
	 a.show1();
//	 a.show2();
	 
	}

}
