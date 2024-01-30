//incorrect output
package enumerators.java.com;

public enum ItsColor {
	RED,
	BLACK,
	PINK;
	private ItsColor
	()
    {
        System.out.println("Constructor called for : "
                           + this.toString());
    }
 
    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}
class MethodInEnum{
	 public static void main(String[] args)
	    {
		 ItsColor c1 = ItsColor.RED;
	        System.out.println(c1);
	        c1.colorInfo();
	    }
}
