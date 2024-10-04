package encapsulation;
public class Person { // fully encapsulated class
	private String name; // instance - Ref
	private int age; // instance - prim
	private String city;
	private static String country; // class - ref 
	
	static {
		// block => used to initialize static variables
		country = "India";
		System.out.println("Country: "+country);
	}
	
	// eliminate the need of setter by a constructor
	public Person(String name, int age) { // parameterized 
		this.name = name;
		this.age = age;
		// principle of locality preference
	}
	
	public Person(String name, int age, String city) {
		this(name,age); // it always must be the first statement
		this.city = city;
	}

	public void getPerson() {
		System.out.println(name+"\n"+age+"\n"+city+"\n"+country);
	}
	
	public static void change() { // no object is required, class name
		country = "USA";
	}
}

// constructor overloading
