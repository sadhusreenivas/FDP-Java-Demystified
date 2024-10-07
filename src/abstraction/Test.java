package abstraction;

public class Test {

	public static void main(String[] args) {
		
		RBI rbi = new Bank(25); //
		
		rbi.disp();
		rbi.transfer();
		rbi.withdraw();
		
		Bank b1 = new Bank(25);
		b1.fun();

	}

}
