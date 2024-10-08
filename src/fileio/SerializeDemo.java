package fileio;
import java.io.*;
public class SerializeDemo {

	public static void main(String[] args) throws Exception {

		Person p1 = new Person("ABC", 30, 123456784321L);
		System.out.println(p1);
		
        // serialization
		FileOutputStream fos = new FileOutputStream("person.info");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p1);
		
		// de-serialization
		FileInputStream fis = new FileInputStream("person.info");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person p2 = (Person) ois.readObject();
		
		// testing after de-ser
		System.out.println(p2);
	}

}
