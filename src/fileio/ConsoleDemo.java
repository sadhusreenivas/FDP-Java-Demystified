package fileio;
import java.io.*;
public class ConsoleDemo {

	public static void main(String[] args) {
	
		Console c = System.console();
		
		System.out.println("Enter User Name: ");
		String uname = c.readLine();
		
		System.out.println("Enter Password: ");
		char[] pwd = c.readPassword();
		
		System.out.println(pwd);
	}

}
