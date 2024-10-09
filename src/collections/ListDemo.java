package collections;
import java.util.*;

public class ListDemo {
	public static void main(String[] args) {
		List al = new LinkedList();
		//System.out.println(al.size());
        al.add(10);
        al.add(3.14);
        al.add("Hello");
        al.add("CDAC");
        al.add(true);
        al.add(null);
        al.add(10);
        
        System.out.println(al);
        // iterate
        for( Object obj :al)
        	System.out.println(obj);
        
        System.out.println("*********************");
        
        // Universal cursor
        ListIterator itr = al.listIterator();
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
       }
        
      System.out.println(itr.previous());
	}

}
