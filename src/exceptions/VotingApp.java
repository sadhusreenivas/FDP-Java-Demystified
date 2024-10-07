package exceptions;

public class VotingApp {

	public void validate(int age) throws InvalidAgeException {
		if (age >= 18)
			System.out.println("Welcome to Vote!");
		else
			throw new InvalidAgeException("under 18-not allowed");
	}

	public static void main(String[] args) {

		VotingApp v1 = new VotingApp();

		try {
			v1.validate(21);
			v1.validate(15);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
        finally {
        	if(v1 != null)
        		v1 = null;
        	System.out.println("finally always executed"); 
        }
		
		System.out.println("rest of the code follows...");
		
	}

}
