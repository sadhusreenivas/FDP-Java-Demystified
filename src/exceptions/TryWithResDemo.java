package exceptions;
import java.io.*;
public class TryWithResDemo {

	public static void main(String[] args) throws IOException {
	
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
         System.out.println("Enter message");
		 String msg = br.readLine();
		 System.out.println("Hello "+msg);
	    } // the resource will get closed automatically
	   
		// NO finally is required
}
}