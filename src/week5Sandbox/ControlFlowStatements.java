package week5Sandbox;

import java.util.Scanner;

public class ControlFlowStatements {
	public static void main(String[] args) {
		lessThan10(7);
		lessThan10(15);
		
		lessThanOrGreater(7);
		lessThanOrGreater(15);
		
		ifElseIf(15);
		ifElseIf(50);
		
		checkRange(15);
		checkRange(5);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a score: ");
		int x = input.nextInt();
		getGrade(x);
		
		System.out.println("Please a number between 1 and 7");
		int y = input.nextInt();
		dayOfWeek(y);
	}
	
	private static void lessThan10(int x) {
		if(x < 10) {
			System.out.println("Less than 10");
		}
	}
	
	private static void lessThanOrGreater(int x) {
		if(x < 10) {
			System.out.println("Less than 10");
		}else {
			System.out.println("Greater than 10");
		}
	}
	
	private static void ifElseIf(int x) {
		if(x < 10) {
			System.out.println("Less than 10");
		}else if (x < 20){
			System.out.println("Between 10 and 20");
		}else {
			System.out.println("Greater than or equal to 20");
		}
	}
	
	private static void checkRange(int x) {
		if(x < 10 || x > 20) {
			System.out.println("Out of range");
		}else {
			System.out.println("In range");
		}
	}
	
	private static void getGrade(int x) {
		if(x > 100 || x < 0) {
			System.out.println("Score out of range");
		}else if(x < 60) {
			System.out.println("F");
		}else if(x < 70) {
			System.out.println("D");
		}else if(x < 80) {
			System.out.println("C");
		}else if(x < 90) {
			System.out.println("B");
		}else {
			System.out.println("A");
		}
	}
	
	private static void dayOfWeek(int x) {
		switch (x) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Not in range");
		}
			
	}
}
