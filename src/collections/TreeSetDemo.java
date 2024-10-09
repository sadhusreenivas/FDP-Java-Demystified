package collections;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
	
		TreeSet<String> ts = new TreeSet(new MyComp());
		ts.add("India");
		ts.add("USA");
		ts.add("Australia");
		ts.add("Canada");
		ts.add("Britan");
		ts.add("India");
		ts.add("South Africa");
		
		System.out.println(ts); // ASC
	

	}
}

