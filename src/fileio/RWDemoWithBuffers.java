package fileio;
import java.io.*;
public class RWDemoWithBuffers {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new FileReader("C://Users//hp//eclipse-workspace-fdp-java-demystified//FDP_Java_App//src//fileio/RWDemoWithBuffers.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C://Users//hp//Desktop//Test.java"));
		
		String line = br.readLine(); //
		
		while(line != null) {
			System.out.println(line);
			bw.write(line);
			line = br.readLine();
		}
		
		br.close();
		bw.close();
		
		System.out.println("File written successfully...."); 
		
	}

}
