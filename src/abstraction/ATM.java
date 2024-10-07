package abstraction;

public interface ATM extends TTP{
	
	int cashback = 10; // public final static int cashback = 10;

	void withdraw(); // public abstract void withdraw();
	void transfer();
	void deposit();
}
