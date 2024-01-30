package test_polymorphism.com;
//runtime  polymorphysm - achieved by method overriding
class Bike{  

	 void run()
	 {
		 System.out.println("running");
     }  
}  
public class DynamicPolymorphysm1 extends Bike{
	void run()
	{
		System.out.println("walking safely with 30km");
	}  
	public static void main(String[] args) {
		Bike d =  new DynamicPolymorphysm1();
		d.run();
	}

}
