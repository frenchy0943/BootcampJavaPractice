package practice;

public class Main {
	public static void main(String[] args) {
		whileLoopExample();
		forLoopExample();
		doWhileLoop();
	}
	
	private static void doWhileLoop() {
		int count = 5;
		System.out.println("This is the do while loop");
		do{
			System.out.println(count--);
		}while(count > 0);
		
	}

	private static void forLoopExample() {
		System.out.println("This is the for loop");
		for(int i = 5; i > 0; i--) {
			System.out.println(i);
		}
		
	}

	private static void whileLoopExample() {
		int count = 5;
		System.out.println("This is the while loop");
		while(count > 0) {
			System.out.println(count--);
		}
	}
}
