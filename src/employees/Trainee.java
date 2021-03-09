package employees;

public class Trainee extends Employee{

	public Trainee() {
		super();
	}
	
	public Trainee(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		basicSalary = salary;
	}
	
}
