package abstraction;

public class ATMDemo {

	public static void main(String[] args) {
		
		ATM atm = new SBI();
		atm.deposit();
		atm.transfer();
		atm.withdraw();
		atm.confirmTransaction();
		
		new SBI().disp();

	}

}
