package inheritancepractice.java.com;

public class P {
	{
		System.out.println(1);
	}

	public static void main(String[] args) {
		R r = new R();
	}
}

class Q extends P {
	{
		System.out.println(2);
	}
}

class R extends Q {
	{
		System.out.println(3);
	}
}
