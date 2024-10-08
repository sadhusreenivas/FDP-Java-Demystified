package fileio;
import java.io.*;

public class FRDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C://Users//hp//Desktop//sample.txt");
		int x;
		int cc = 0;
		int wc = 0;
		int lc = 0;
		
		while( (x = fr.read()) != -1 ) { // eof = -1
			System.out.print((char)x);
			cc++;
			if(x == ' ')
				wc++;
			if(x=='\n')
				lc++;
		}
		fr.close();
		System.out.println("\nCharacters: "+cc+"\nWords: "+(wc+lc)+"\nLines: "+lc);
		
		FileWriter fw = new FileWriter("C://Users//hp//Desktop//result.txt");
		fw.write("characters: "+cc);
		fw.write("\nWords: "+ (wc+lc));
		fw.write("\nLines: "+lc);
		
		fw.close();
		
		
		
		}

	}

