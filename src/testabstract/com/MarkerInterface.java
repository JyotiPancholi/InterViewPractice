package testabstract.com;

//It is an empty interface (no field or methods). 
//Examples of marker interface are Serializable, Cloneable and Remote interface.
//All these interfaces are empty interfaces. 


//example for cloneable(https://www.geeksforgeeks.org/marker-interface-java/)
class A implements Cloneable
{
    int i;
    String s;
  
    // A class constructor
    public A(int i,String s)
    {
        this.i = i;
        this.s = s;
    }
  
    // Overriding clone() method
    // by simply calling Object class
    // clone() method.
    @Override
    protected Object clone()
    throws CloneNotSupportedException
    {
        return super.clone();
    }
}
public class MarkerInterface {

	public static void main(String[] args) throws CloneNotSupportedException {
		 A a = new A(20, "GeeksForGeeks");
	        // cloning 'a' and holding
	        // new cloned object reference in b
	        // down-casting as clone() return type is Object
	        A b = (A)a.clone();
	  
	        System.out.println(b.i);
	        System.out.println(b.s);
	}
}
