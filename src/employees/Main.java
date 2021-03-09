package employees;

public class Main {

	public static void main(String[] args) {
		Manager m1 = new Manager(126534L, "Peter", "Chennai India", 237844L, 65000);
		m1.calculateSalary();
		m1.calculateTransportAllowance();
		Trainee t1 = new Trainee(19846L, "Jack", "Mumbai India", 442085L, 45000);
		t1.calculateSalary();
		t1.calculateTransportAllowance();
	}
	
}
