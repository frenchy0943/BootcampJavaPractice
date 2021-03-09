package week5Sandbox;

public class Deck1_5 {
	public static void main(String[] args) {
		multiplicationTable();
	}

	private static void multiplicationTable() {
		System.out.println("\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12\n");
		for(int i = 1; i < 13; i++) {
			System.out.print(i + "\t");
			for(int j = 1; j < 13; j++) {
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}
	}

}
