package testabstract.com;

interface Tests
{
   interface Yes
   {
      void show();    
   }
}
  
class Testingg implements Tests.Yes
{
   public void show()
   {
      System.out.println("show method of interface");
   } 
} 
public class InterfaceInInterface {

	public static void main(String[] args) {
		 Tests.Yes obj;
	     Testingg t = new Testingg();
	     obj = t;
	     obj.show();
	}
}