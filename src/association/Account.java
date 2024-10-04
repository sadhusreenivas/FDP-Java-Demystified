package association;

public class Account {
	
	private int accNo;
	private String accType;
	private double accBal;
	
	public Account(int accNo, String accType, double accBal) {
		super(); // Object
		this.accNo = accNo;
		this.accType = accType;
		this.accBal = accBal;
	}
	
	public void getAccount() {
		System.out.println(accNo+" "+accType+" "+accBal);
	}

}
