package inheritance;

public class TechEmp extends Employee{ // 1. 2. 3
	private int bonus; //
	
	public TechEmp(int eid, String name, double basicPay, int bonus) {
		super(eid, name, basicPay); // first stmt
		this.bonus = bonus; 
	}

	// re-define => overriding
	@Override
	public void calSalary() { // signature must be same
		double da = 0.5;
		double hra = 0.3;
		double ta = 0.1;
		
		double salary = basicPay + basicPay*(da+hra+ta) + bonus;
		System.out.println("Total Salary: "+salary);
	}
	@Override
	public void getEmployee() {
		super.getEmployee(); // parent's method
		System.out.println("Bonus: "+bonus);
	}
	

	// getEmployee()
	// calSalary()
}


// super => immediate parent class -> constructors, methods, data 