package library;

public class KidUser implements LibraryUser{

	private int age;
	private String bookType;
	
	public KidUser(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}
	
	public void registerAccount() {
		if(age < 12) {
			System.out.println("You have succesfully registered under a Kids Account");
		}else {
			System.out.println("Sorry age must be less than 12 to register as a kid");
		}
	}

	@Override
	public void requestBook() {
		if(bookType.equals("Kids")) {
			System.out.println("Book issued succesfully, please return within 10 days");
		}else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}

}
