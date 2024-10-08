package fileio;
import java.io.Serializable;

public class Person implements Serializable {

	private String name;
	private int age;
	private transient long aadhar; // wl not get serialized =>0L
	
	public Person(String name, int age, long aadhar) {
		super();
		this.name = name;
		this.age = age;
		this.aadhar = aadhar;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", aadhar=" + aadhar + "]";
	}
	
	
	
}
