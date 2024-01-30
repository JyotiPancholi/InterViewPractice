package testabstract.com;

class Testt
{
    protected interface Yes
    {
        void show();
    }
}
  
class Testings implements Testt.Yes
{
    public void show()
    {
        System.out.println("show method of interface");
    }
}
 
public class NestedInterface {

	public static void main(String[] args) {
		Testt.Yes obj;
        Testings t = new Testings();
        obj = t;
        obj.show();
	}
}