package innerclasses;

abstract public class Person {

	abstract void eat(); //
	
	void speak() {
		System.out.println("Speaks English");
	}
	
	public static void main(String[] args) {
		// AIC
		Person p = new Person() {
			@Override
			public void eat() {
				System.out.println("Eating Veggies...");
			}
			@Override
			void speak() {
				System.out.println("Speaks Telugu");
			}
			
		};
		p.eat(); // 
		p.speak();
	}
}
