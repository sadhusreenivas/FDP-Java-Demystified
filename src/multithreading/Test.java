package multithreading;

public class Test {

	public static void main(String[] args) {
		
		Display d = new Display();
		
		Thread t1 = new Thread() {
			public void run() {
				d.printUpper();
			}
		};
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				d.printLower();			}
		};
		t2.start();
		
		Thread t3 = new Thread() {
			public void run() {
				d.printNumbers();
			}
		};
		t3.start();

	}

}
