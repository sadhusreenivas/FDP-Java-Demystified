package multithreading;

public class Display {
	
	public synchronized void printUpper() {
		for(int i=65; i<=90; i++)
			System.out.print((char)i+" ");
		
		System.out.println();
	}

	public synchronized void printLower() {
		for(int i=97; i<=122; i++)
			System.out.print((char)i+" ");
		
		System.out.println();
		
	}
	
	public  synchronized void printNumbers() {
		for(int i=65; i<=122; i++) {
			if(i>90 && i<97)
				continue;
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}
