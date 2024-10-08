package multithreading;

public class RunnableDemo implements Runnable{
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++)
			System.out.println(i);
	}

	public static void main(String[] args) {
       // Runnable instances
		Runnable r1 = new RunnableDemo();
		Runnable r2 = new RunnableDemo();
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		Thread t2 = new Thread(r2);
		t2.start();
		
		for(int i=11; i<=20; i++)
			System.out.println(i);
	}

	
}
