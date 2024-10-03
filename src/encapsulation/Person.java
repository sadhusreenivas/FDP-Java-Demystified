package encapsulation;
public class Person { // fully encapsulated class
	private String name;
	private int age;
	
	public void setPerson(String n, int a) {
		name = n;
		age = a;
	}
	
	public void getPerson() {
		System.out.println(name+"\n"+age);
	}
	
}
