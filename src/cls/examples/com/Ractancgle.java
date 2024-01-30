package cls.examples.com;
//Object and Class Example: Rectangle
class Ractangle {
int lenght,width;
	void insert(int l,int w) 
	{
		lenght = l;
		width = w;
	}
	void area() 
	{
		System.out.println("area ="+(lenght*width) );
	}
}
class TestRectangle{
public static void main(String[] args) {
	Ractangle r = new Ractangle();
	r.insert(12, 24);
	r.area();
	}
}
