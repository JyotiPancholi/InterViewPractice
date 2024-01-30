package test_polymorphism.com;
//compile-time polymorphysm - achieved by method overloading

class Calculation
{
public int add(int a ,int b) 
{
	 return a+b;
}
public int add(int a ,int b,int c) 
{
	 return a+b+c;
}
}

public class StaticPolymorphysm1 extends Calculation {

	public static void main(String[] args) {
		StaticPolymorphysm1 sp =  new StaticPolymorphysm1();
		System.out.println(sp.add(23, 34));
		System.out.println(sp.add(23, 45, 56));
	}

}
