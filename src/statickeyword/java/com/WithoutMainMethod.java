package statickeyword.java.com;
//one of the ways was the static block, but it was possible till 
//JDK 1.6. Since JDK 1.7, it is not possible to execute a Java class
//without the main method
public class WithoutMainMethod {

	static 
	{
		System.out.println("static block invocked");
		System.exit(0);
	}
}
