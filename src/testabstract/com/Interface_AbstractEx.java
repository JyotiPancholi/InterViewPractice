package testabstract.com;

//What if we don’t have any common code between rectangle and circle then go with the interface. 

interface Shhape {
	 
    // Abstract method
    void draw();
    double area();
}
 
// Class 1
// Helper class
class Recttangle implements Shhape {
 
    int length, width;
 
    // constructor
    Recttangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }
 
    @Override public void draw()
    {
        System.out.println("Rectangle has been drawn ");
    }
 
    @Override public double area()
    {
        return (double)(length * width);
    }
}
 
// Class 2
// Helper class
class Circle1 implements Shhape {
 
    double pi = 3.14;
    int radius;
 
    // constructor
    Circle1(int radius) { this.radius = radius; }
 
    @Override public void draw()
    {
        System.out.println("Circle has been drawn ");
    }
 
    @Override public double area()
    {
 
        return (double)((pi * radius * radius));
    }
}
 
public class Interface_AbstractEx {

	public static void main(String[] args) {
		 // Creating the Object of Rectangle class
        // and using shape interface reference.
        Shhape rect = new Recttangle(2, 3);
 
        System.out.println("Area of rectangle: "
                           + rect.area());
 
        // Creating the Objects of circle class
        Shhape circle = new Circle1(2);
 
        System.out.println("Area of circle: "
                           + circle.area());
	}
}
