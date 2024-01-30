package testcallbyvalue.callbyrefrnc.com;

class Numbers {
	   int x;
	}

public class TestReference {

	public static void main(String[] args) {
	    Numbers a = new Numbers();
	      a.x=4;
	      System.out.println(a.x);
	      Numbers b=a;//custom wrapping
	      b.x=5;
	      System. out.println(b.x);
	}

}
