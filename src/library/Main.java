package library;

public class Main {
	public static void main(String[] args) {
		KidUser k1 = new KidUser(10, "Kids");
		k1.registerAccount();
		k1.requestBook();
		
		AdultUser a1 = new AdultUser(23, "Fiction");
		a1.registerAccount();
		a1.requestBook();
	}
}
