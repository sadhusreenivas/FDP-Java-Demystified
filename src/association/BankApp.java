package association;

public class BankApp {

	public static void main(String[] args) {
		
		Account acc = new Account(1234567, "Savings", 100000);
		Customer c1 = new Customer(321, "ASDF", acc);
		
		c1.getCustInfo(); // include account info

	}

}
