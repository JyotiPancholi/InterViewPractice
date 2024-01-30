package thiskeyword.java.com;
//Solution of the above problem by this keyword
public class WithThisKeyword {
int id ;
String name;
float fee;

public WithThisKeyword(int id, String name, float fee) {
	super();
	this.id = id;
	this.name = name;
	this.fee = fee;
}
void display() {
	System.out.println(id+" "+name+" "+fee);
}
}
class Test{
	public static void main(String[] args) {
		WithThisKeyword w1 = new WithThisKeyword(111, "jiya", 76584f);
		WithThisKeyword w2 = new WithThisKeyword(222, "jyoti",45639f);
		w1.display();
		w2.display();
	}

}
