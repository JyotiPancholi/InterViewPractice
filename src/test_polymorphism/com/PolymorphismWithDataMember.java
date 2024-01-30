package test_polymorphism.com;
//Java Runtime Polymorphism with Data Member

class Bikes{  
	 int speedlimit=90;  
	}  
public class PolymorphismWithDataMember extends Bikes{
	 int speedlimit=150;
	public static void main(String[] args) {
		 Bikes obj=new PolymorphismWithDataMember();  
		  System.out.println(obj.speedlimit);//90  
	}

}
