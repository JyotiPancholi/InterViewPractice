package cls.examples.com;
//Java Program to illustrate the use of Rectangle class which  
//has length and width data members 
public class MultipleObByOnetype {
 int lenght,width;

	void values(int l,int w) 
  {
	 lenght =l;
	 width  =w;
  }
 void calculateArea()
  {
	 System.out.println("area of ractangle is ="+(lenght*width));
  }
}