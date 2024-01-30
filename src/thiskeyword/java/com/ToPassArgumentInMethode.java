package thiskeyword.java.com;

public class ToPassArgumentInMethode {
void m(ToPassArgumentInMethode obj) 
{
	System.out.println("method is invoked");
}
void p()
{
	m(this);
}
	public static void main(String[] args) {
		ToPassArgumentInMethode s =  new ToPassArgumentInMethode();
		s.p();
	}

}
