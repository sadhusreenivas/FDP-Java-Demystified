package encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person("Java", 29); // param cons
		p1.getPerson(); // Java 29
		
		Person.change(); // static method
		
		Person p2 = new Person("ABC", 30,"Hyd");
		p2.getPerson();

	}
}


// new Person()
// GC => Automatic GC