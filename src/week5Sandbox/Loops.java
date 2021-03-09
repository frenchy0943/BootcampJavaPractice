package week5Sandbox;

public class Loops {
	public static void main(String[] args) {
		System.out.println("Print 1-10 with for loop");
		printWithFor();
		System.out.println("Print 0 - 100 incrementing by 10 with while loop");
		printWithWhile();
		System.out.println("Print 1 - 10 with do while loop");
		printWithDoWhile();
		System.out.println("Print multiples of 5 not between 25 and 75");
		printMultiplesOf5();
		System.out.println("Print multiples of 5 up to 50");
		printMultiples();
		System.out.println("Using nested loops");
		nestedLoops();
		System.out.println("Print palindromes between 10 and 200");
		printPalindromes();
		System.out.println("Print the fibonacci sequence from 0 - 50");
		fibonacci();
		System.out.println("Using nested for loops");
		nestedForLoops();
	}
	
	private static void printWithFor() {
		for(int i = 1; i < 11; i++) {
			System.out.println(i);
		}
	}
	
	private static void printWithWhile() {
		int x = 0;
		while(x < 101) {
			System.out.println(x);
			x += 10;
		}
	}
	private static void printWithDoWhile() {
		int x = 1;
		do {
			System.out.println(x);
			x++;
		}while(x < 11);
	}
	
	private static void printMultiplesOf5() {
		for(int i = 1; i < 101; i++) {
			if(i > 25 && i < 75) {
				continue;
			}else {
				if(i % 5 == 0) {
					System.out.println(i);
				}
			}
		}
	}
	
	private static void printMultiples() {
		for(int i = 1; i < 101; i++) {
			if(i > 50) {
				break;
			}else {
				if(i % 5 == 0) {
					System.out.println(i);
				}
			}
		}
	}
	
	private static void nestedLoops() {
		for(int i = 1; i < 3; i++) {
			System.out.println("Week " + i + ":");
			for(int j = 1; j < 6; j++) {
				System.out.println("Day " + j);
			}
		}
	}
	
	private static void printPalindromes() {
		String finalOutput = "";
		int remainder;
		for(int i = 10; i < 200; i++) {
			int reversed = 0;
			for(int num = i ;num != 0; num /= 10) {
				remainder = num % 10;
				reversed = reversed * 10 + remainder;
			}
			if(reversed == i) {
				finalOutput += i + ", ";
			}
		}
		System.out.println(finalOutput);
	}
	
	private static void fibonacci() {
		String output = "0, ";
		int prev = 0;
		int next = 1;
		while(prev + next < 50) {
			output += next + ", ";
			int temp = next;
			next += prev;
			prev = temp;
		}
		output += next + "";
		System.out.println(output);
	}
	
	private static void nestedForLoops() {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Inner loop: i: " + i + ", j: " + j);
			}
		}
	}
}
