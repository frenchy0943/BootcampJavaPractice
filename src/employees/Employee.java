package employees;

public class Employee {

	protected long employeeId;
	protected String employeeName;
	protected String employeeAddress;
	protected long employeePhone;
	protected double basicSalary;
	protected double specialAllowance;
	protected double hra;
	
	public Employee() {
		specialAllowance = 250.80;
		hra = 1000.50;
	}
	
	public Employee(long id, String name, String address, long phone) {
		employeeId = id;
		employeeName = name;
		employeeAddress = address;
		employeePhone = phone;
		specialAllowance = 250.80;
		hra = 1000.50;
	}
	
	public void calculateSalary() {
		double salary = basicSalary + (basicSalary * (specialAllowance/100)) + 
				(basicSalary * (hra/100));
		System.out.println("Salary: " + salary);
	}
	
	public void calculateTransportAllowance() {
		double transportAllowance = 0.1 * basicSalary;
		System.out.println("Transport Allowance: " + transportAllowance);
	}
	
}
