package test_polymorphism.com;
//Java Interfaces as Virtual Function

interface Car{    
void print();    
}    
public class InterfaceAsVirtualFunc implements Car {
	@Override
	public void print() {
		System.out.println("BMW car ");
	}

	public static void main(String[] args) {
		InterfaceAsVirtualFunc i = new InterfaceAsVirtualFunc();
		i.print();
	}
}
