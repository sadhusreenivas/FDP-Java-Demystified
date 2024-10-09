package collections;

import java.util.Comparator;

public class MyComp implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		//return s2.compareTo(s1); // DESC
		return s2.length() - s1.length();
 	}

}
