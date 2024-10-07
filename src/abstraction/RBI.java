package abstraction;

abstract public class RBI {
	int cashback;
	
	public RBI(int cashback) {
		super();
		this.cashback = cashback;
	}
	abstract void withdraw();
	abstract void transfer();
	
	public void disp() {  // concrete
		System.out.println("I am RBI");
	}
}

// 66.6%