package encapsulation;
public class Person { // fully encapsulated class
	private String name; // instance - Ref
	private int age; // instance - prim
	private static String country = "India"; // class - ref 
	
	public Person() {
		// instance - default values
	}
	
	// eliminate the need of setter by a constructor
	public Person(String n, int a) { // parameterized 
		name = n;
		age = a;
	}
	
	public void getPerson() {
		System.out.println(name+"\n"+age+"\n"+country);
	}
}

// constructor overloading
