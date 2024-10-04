package association;

public class Customer {

	private int cid;
	private String name;
	private static String bank = "SBI";
	private Account account; // object ref
	// address
	//CC
	//DB
	public Customer(int cid, String name, Account account) {
		super();
		this.cid = cid;
		this.name = name;
		this.account = account;
	}
	
	public void getCustInfo() {
		System.out.println(cid+" "+name+" "+bank);
		account.getAccount();
	}
	
	
}
