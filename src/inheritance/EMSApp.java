package inheritance;

public class EMSApp {

	public static void main(String[] args) {
		Employee e1 = new Employee(12345, "ABC", 100000);
		e1.getEmployee();
		e1.calSalary();

		TechEmp te1 = new TechEmp(11223, "XYZ", 100000, 10000);
		te1.getEmployee(); // all emp details with bonus
		te1.calSalary();
		
		
	}

}
