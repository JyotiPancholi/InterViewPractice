package statickeyword.java.com;
//Program of counter by static variable
public class Counter2 {
static int count = 0;

	public Counter2() {
	count++;
	System.out.println(count);
}

	public static void main(String[] args) {
		Counter2 c1 = new Counter2();
		Counter2 c2 = new Counter2();
		Counter2 c3 = new Counter2();
	}

}
