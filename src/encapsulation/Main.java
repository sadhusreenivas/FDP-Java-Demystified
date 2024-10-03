package encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person("Java", 29); // param cons
		p1.getPerson(); // Java 29
		
		Person p2 = new Person(); // default
		p2.getPerson(); // null 0
		
		p1 = null; // garbage
		p2 = null;  // garbage
		
		new Person("Python",33).getPerson(); // anonymous object => garbage

	}
}


// new Person()
// GC => Automatic GC