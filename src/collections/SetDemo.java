package collections;
import java.util.*;

public class SetDemo {
	public static void main(String[] args) {
		
       Set hs = new HashSet();
       hs.add(10);
       hs.add("CDAC");
       hs.add(3.14);
       hs.add("CDAC");  // ignored
       hs.add(true);
       hs.add("Hyd");
       hs.add(501510);
       
       System.out.println(hs);
       
       Iterator itr = hs.iterator();
       while(itr.hasNext()) {
    	   System.out.println(itr.next()); 
    	   
       }
	}

}
