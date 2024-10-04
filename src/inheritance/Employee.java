package inheritance;

public class Employee {
	private int eid;
	private String name;
	protected double basicPay; // child classes
	private static String org = "C-DAC";
	
	public Employee(int eid, String name, double basicPay) {
		this.eid = eid;
		this.name = name;
		this.basicPay = basicPay;
	}
	
	public void getEmployee() {
		System.out.println(eid+" "+name+" "+basicPay+" "+org);
	}
	
	public void calSalary() {
		double da = 0.5;
		double hra = 0.3;
		double ta = 0.1;
		
		double salary = basicPay + basicPay*(da+hra+ta);
		System.out.println("Total Salary: "+salary);
	}

	public double getBasicPay() {
		return basicPay;
	}

	
}
