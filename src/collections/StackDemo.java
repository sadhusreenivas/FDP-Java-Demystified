package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.add(10);
		s.push(20);
		s.push("ABC");
		s.push(3.14);
		s.add(false);
		s.add(10);
		s.add(null);
		s.push("XYZ");
		System.out.println(s);
		
		System.out.println(s.pop());
		System.err.println(s.peek());
		
		System.out.println(s.size());
		System.err.println(s.capacity()); // 10
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*******************");
		// legacy cursor
		Enumeration e = s.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}

}
