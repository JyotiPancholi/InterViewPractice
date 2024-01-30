package testabstract.com;


abstract class Shape
{
String color;
abstract double area();
public abstract String toString();
public Shape(String color) {
	System.out.println("shape constructor called");
	this.color = color;
}
public String getColor() {
	return color;
	
}
}

class Circle extends Shape
{
	double radius;
	public Circle(String color, double radius) {
		super(color);
		System.out.println("circle construcot called !");
		this.radius = radius;
	}
	@Override
	double area() {
		return Math.PI*Math.pow(radius, 2);
	}
	@Override
	public String toString() {
		return "circle color is - " +super.getColor()+" and the area is - "+ area();
	}
}
class Rectangle extends Shape
{
	double length;
    double width;	
     public Rectangle(String color ,double lenght, double width) {
		super(color);
		System.out.println("rectangle contructor called");
		this.length = lenght;
		this.width = width;
	}
	@Override
	double area() {
		return length*width;
	}
	@Override
	public String toString() {
		return "Rectangle color is - "+super.getColor()+" and area of rectangle is - "+area();
	}
}
public class AbstractTwo {
	public static void main(String[] args) {
		Shape s1 =  new Circle("RED", 5.2);
	    Shape s2  =  new Rectangle("Blue", 3, 4);
	    System.out.println(s1.toString());
	    System.out.println(s2.toString());
	}
}
