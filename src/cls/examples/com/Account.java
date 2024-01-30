package cls.examples.com;

public class Account {
	int ac_num;
	String name;
	float amount;

	void insert(int acn, String n, float a) {
		ac_num = acn;
		name = n;
		amount = a;
	}

	void deposite(float a) {
		amount = amount + a;
		System.out.println(a + " deposited");
	}

	void withdrawl(int a) {
		if (amount < a) {
			System.out.println("insufficient balance !");
		} else {
			amount = amount - a;
			System.out.println(a + "withdrawn");
		}
	}

	void checkBalance() {
		System.out.println("Balance is: " + amount);
	}

	void display() {
		System.out.println(ac_num + " " + name + " " + amount);
	}

	public static void main(String[] args) {
		Account ac = new Account();
		ac.insert(34000, "radha", 33000);
		ac.display();
		ac.checkBalance();
		ac.deposite(23000);
		ac.checkBalance();
		ac.withdrawl(32000);
		ac.checkBalance();
	}

}
