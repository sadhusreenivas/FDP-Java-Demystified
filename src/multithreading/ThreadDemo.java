package multithreading;

public class ThreadDemo extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		
		ThreadDemo t1 = new ThreadDemo();
		t1.setName("first");
		ThreadDemo t2 = new ThreadDemo();
		t2.setPriority(MAX_PRIORITY);
		ThreadDemo t3 = new ThreadDemo();
		t3.setName("third");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
