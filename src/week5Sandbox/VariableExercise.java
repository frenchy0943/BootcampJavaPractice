package week5Sandbox;

import java.text.NumberFormat;

public class VariableExercise {
	public static void main(String[] args) {
		addInts();
		addDoubles();
		addIntDouble();
		divideInts();
		divideDoubleInt();
		divideDoubles();
		divideIntAndDouble();
		constantCalculation();
		cafe();
	}

	private static void addInts() {
		System.out.println("This is adding integers");
		int x = 7;
		int y = 5;
		int sum = x + y;
		System.out.println(sum);
	}

	private static void addDoubles() {
		System.out.println("This is adding doubles");
		double x = 5.5;
		double y = 7.8;
		double sum = x + y;
		System.out.println(sum);
	}

	private static void addIntDouble() {
		System.out.println("This is adding a double and an interger");
		int x = 7;
		double y = 6.4;
		double sum = x + y;
		System.out.println(sum);
	}

	private static void divideInts() {
		System.out.println("This is dividing integers");
		int x = 50;
		int y = 6;
		int answer = x / y;
		System.out.println(answer);
	}

	private static void divideDoubleInt() {
		System.out.println("This is dividing a double by an integer");
		double x = 50.0;
		int y = 6;
		// Answer must also be changed to a double
		// because you can't assign a double to an int
		double answer = x / y;
		System.out.println(answer);
	}

	private static void divideDoubles() {
		System.out.println("This is dividing doubles");
		double x = 50.0;
		double y = 10.0;
		double answer = x / y;
		System.out.println(answer);
	}

	private static void divideIntAndDouble() {
		System.out.println("This shows the differnce between diving an int by an int and an double by a double");
		System.out.println("Two ints");
		int x = 5;
		int y = 6;
		double q = y / x;
		System.out.println(q);
		System.out.println("This is double / int");
		q = (double) y;
		System.out.println(q);
	}

	private static void constantCalculation() {
		System.out.println("This is using a constant");
		final int x = 6;
		System.out.println(x + 7);
	}

	private static void cafe() {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		final double SALES_TAX = 0.07;
		double coffee = 4.5;
		double tea = 3.7;
		double mocha = 5.3;
		double subtotal = 3 * coffee + 4 * tea + 2 * mocha;
		double totalSale = subtotal + subtotal * SALES_TAX;
		System.out.println("The total is: " + formatter.format(totalSale));
	}

}
