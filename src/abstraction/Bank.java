package abstraction;

public class Bank extends RBI{
	
	public Bank(int cashback) {
		super(cashback);	
	}

	@Override
	void withdraw() {
		System.out.println("Withdraw success and you got cashback: "+cashback);
	}

	@Override
	void transfer() {
		System.out.println("Tranfer success...you got cashback: "+cashback);
	}

	@Override
	public void disp() {
		super.disp(); // Im RBI
		System.out.println("I am Bank");
	}
	
	public void fun() {
		System.out.println("Generating fun...");
	}
	
}
