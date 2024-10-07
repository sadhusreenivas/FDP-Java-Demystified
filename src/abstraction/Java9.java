package abstraction;

public interface Java9 {
	String msg = "Welcoem to Java 9 features";
	void fun(); // a m
	default void test() {
		System.out.println("This is a default method...");
		pvtMethod();
	}
	private void pvtMethod() {
		System.out.println("It a private method");
	}
	static void stMethod() {
		System.out.println("Its a static method");
	}
   
}
