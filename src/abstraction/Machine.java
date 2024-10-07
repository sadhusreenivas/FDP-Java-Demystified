package abstraction;

public class Machine implements Printable, Showable { // Multiple Inheritance

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("It displays content");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Its printing");
	}
	
	public static void main(String[] args) {
		
		Machine m = new Machine();
		m.show();
		m.print();
	}

}
