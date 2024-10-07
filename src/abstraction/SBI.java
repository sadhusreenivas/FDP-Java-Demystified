package abstraction;

public class SBI implements ATM{

	@Override
	public void withdraw() {
		System.out.println("withdraw success...got cashback: "+cashback);
	}

	@Override
	public void transfer() {
		System.out.println("transfer success...");
	}

	@Override
	public void deposit() {
		System.out.println("Deposited....!!");
	}

	void disp() {
		System.out.println("I am SBI");
	}

	@Override
	public void confirmTransaction() {
		System.out.println("Transaction confirmed!");
		
	}
}
