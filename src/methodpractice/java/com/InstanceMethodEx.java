package methodpractice.java.com;

public class InstanceMethodEx {

	public static void main(String[] args) {
		InstanceMethodEx i =  new InstanceMethodEx();
		System.out.println("The sum is = "+i.add(12,13));
	}
	int s;

	private int add(int i, int j) {
		s=i+j;
		return s;
	}

}
