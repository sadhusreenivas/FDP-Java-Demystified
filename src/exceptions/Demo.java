package exceptions;
import java.io.*;
public class Demo {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name");
		String name = br.readLine();
		
		System.out.println("Enter age");
		int age = Integer.parseInt(br.readLine());
		
		System.out.println(name+ "   "+age);

	}

}
