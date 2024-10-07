package exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x=0, y=0;
		System.out.println("Enter numbers:");
		try {
		x = scanner.nextInt(); //
		y = scanner.nextInt();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(x+" "+y);
		
		int sum = x+y;
		System.out.println(sum);
		try {
		int res = x/y; // throw new ArithmeticException();
		System.out.println(res);
		}
		catch(Exception e) {
			System.err.println(e); // e.toString()
		}
		finally {
			if(scanner != null)
				scanner.close();
			System.out.println("Resources closed / saved...");
		}
		
		int prod = x*y;
		System.out.println(prod);
		
		System.out.println("Rest of the code....");
		
		
		
	}
}
