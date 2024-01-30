package cls.examples.com;

public class TestVariable {
	public static void main(String[] args) {
		MultipleObByOnetype r1 = new MultipleObByOnetype();
		MultipleObByOnetype r2 = new MultipleObByOnetype();
		r1.values(2, 3);
		r2.values(4, 5);
		r1.calculateArea();
		r2.calculateArea();
	}

}
