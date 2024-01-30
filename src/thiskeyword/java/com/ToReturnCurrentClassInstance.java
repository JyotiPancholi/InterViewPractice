package thiskeyword.java.com;

public class ToReturnCurrentClassInstance {

ToReturnCurrentClassInstance getToReturnCurrentClassInstance() {
	return this;
}
void msg()
{
System.out.println("hello java");	
}
	public static void main(String[] args) {
      new ToReturnCurrentClassInstance().getToReturnCurrentClassInstance().msg();
	}

}
