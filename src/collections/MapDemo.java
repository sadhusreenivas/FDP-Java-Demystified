package collections;
import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
	
		Map<String, Integer> emp = new TreeMap();
		emp.put("Mamatha", 10000);
		emp.put("Aparna", 10000);
		emp.put("Sahitya", 12000);
		emp.put("Kumar", 20000);
		emp.put("Kumar", 15000); // dup
		
		System.out.println(emp);
		
		Collection c1 = emp.keySet();
		System.err.println(c1);
		
		Collection c2 = emp.values();
		System.out.println(c2);

		// Iterate
		Set s = emp.entrySet();
		Iterator itr = s.iterator();
		
		while(itr.hasNext()) {
			Map.Entry m = (Map.Entry) itr.next();
			System.out.println(m.getKey()+"     "+m.getValue());
		}
		
	}

}
