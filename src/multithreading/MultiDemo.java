package multithreading;

public class MultiDemo extends Thread {
    
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			try {
			Thread.sleep(500,750);
			}catch(Exception e ) {System.err.println(e);}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		MultiDemo t1 = new MultiDemo();
		t1.start();
		
		t1.join(2500); // prioritizing
		
		MultiDemo t2 = new MultiDemo();
		t2.start();
		
		MultiDemo t3 = new MultiDemo();
		t3.start();
		

	}

}
