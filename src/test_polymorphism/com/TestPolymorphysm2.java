package test_polymorphism.com;

class Shape{  
void draw(){System.out.println("drawing...");}  
}  
class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle...");}  
}  
class Circles extends Shape{  
void draw(){System.out.println("drawing circle...");}  
}  
class Triangle extends Shape{  
void draw(){System.out.println("drawing triangle...");}  
}  
public class TestPolymorphysm2 {

	public static void main(String[] args) {
		Shape s;  
		s=new Rectangle();  
		s.draw();  
		s=new Circles();  
		s.draw();  
		s=new Triangle();  
		s.draw();  
	}

}
