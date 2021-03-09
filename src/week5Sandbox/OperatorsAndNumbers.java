package week5Sandbox;

public class OperatorsAndNumbers {
	/*
	 * Decimal to Binary conversions
	 * 1 = 0001
	 * 8 = 1000
	 * 33 = 0010 0001
	 * 78 = 0100 0110
	 * 787 = 0011 0001 0011
	 * 33,987 = 1000 0100 1100 0011
	 */
	
	/*
	 * Binary to Decimal conversions
	 * 0010 = 2
	 * 1001 = 9
	 * 0011 0100 = 52
	 * 0111 0010 = 114
	 * 0010 0001 1111 = 543
	 * 0010 1100 0110 0111 = 11,367
	 */
	
	public static void main(String[] args) {
		System.out.println("Left shift operations");
		//Decimal will be 4
		//Binary will be 0100
		leftShift(2);
		//Decimal will be 18
		//Binary will be 0001 0010
		leftShift(9);
		//Decimal will be 34
		//Binary will be 0010 0010
		leftShift(17);
		//Decimal will be 176
		//Binary will be 1011 0000
		leftShift(88);
		
		System.out.println("\nRight shift operations");
		//Decimal will be 37
		//Binary will be 0010 0101
		rightShift(150);
		//Decimal will be 56
		//Binary will be 0011 1000
		rightShift(225);
		//Decimal will be 388
		//Binary will be 0001 1000 0100
		rightShift(1555);
		//Decimal will be 8114
		//Binary will be 0001 1111 1011 0010
		rightShift(32456);
		
		System.out.println("\nUsing bit wise & and | on 7 and 17");
		bitwiseAndOr();
		
		System.out.println("\nUsing postfix increment");
		postfix();
		
		System.out.println("\nIncrementing a number three ways");
		incrementThreeWays();
		
		System.out.println("\nUsing increments and calculations");
		addition();
	}
	
	private static void leftShift(int num) {
		int x = num;
		System.out.println(Integer.toBinaryString(x));
		x = x << 1;
		System.out.println("Decimal: " + x);
		System.out.println("Binary: " + Integer.toBinaryString(x));
	}
	
	private static void rightShift(int num) {
		int x = num;
		System.out.println(Integer.toBinaryString(x));
		x = x >> 2;
		System.out.println("Decimal: " + x);
		System.out.println("Binary: " + Integer.toBinaryString(x));
	}
	
	private static void bitwiseAndOr() {
		int x = 7;
		int y = 17;
		//Result will be 1 and 0001
		int z = x & y;
		System.out.println("Using bitwise &");
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z));
		
		//Result will be 23 and 0001 0111
		z = x | y;
		System.out.println("Using bitwise |");
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z));
	}
	
	private static void postfix() {
		int x = 5;
		System.out.println("Before: " + x);
		x++;
		System.out.println("After: " + x);
	}
	
	private static void incrementThreeWays() {
		int x = 5;
		int y = 10;
		for(int i = 0; i < 3; i++) {
			System.out.println(x + " " + y + " " + i);
			x += 1;
			++y;
		}
	}
	
	private static void addition() {
		int x = 5;
		int y = 8;
		int sum = x++ + y;
		System.out.println(sum);
	}
	
}
