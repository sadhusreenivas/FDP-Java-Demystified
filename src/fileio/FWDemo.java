package fileio;
import java.io.*;
public class FWDemo {

	public static void main(String[] args) throws IOException {
		
		//File file = new File("C://Users//hp//Desktop//sample.txt");
		
		FileWriter fw = new FileWriter("C://Users//hp//Desktop//sample.txt", true); // true => append
		
		fw.write("Java is OOP\nJava is Platform Independent\nJava is compiled & Interpreted");
		fw.write("\nJava is robust\nJava high performance\nJava is Secure\n");
		fw.write("C-DAC Hyd\n");
		fw.write("Hardware Park\n");
		
		fw.close();
		System.out.println("File Written Successfully");
		
	}

}
