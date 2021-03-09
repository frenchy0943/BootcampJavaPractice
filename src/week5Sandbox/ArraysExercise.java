package week5Sandbox;

import java.util.Arrays;

public class ArraysExercise {

	public static void main(String[] args) {
		System.out.println("Small array");
		smallArray();
		System.out.println("Print the middle value of an array");
		printMiddle();
		System.out.println("Cloning an array");
		cloneString();
		System.out.println("Checking length exceptions");
		lengthExceptions();
		System.out.println("Assinging value to array with a loop");
		assignValue();
		System.out.println("Assigning more values to array with loop");
		assignTwiceValues();
		System.out.println("Printing everything but the middle entry");
		printNotMiddle();
		System.out.println("Swapping elements in an array");
		swapElements();
		System.out.println("Sorting an array");
		sortArray();
		System.out.println("Using an object array");
		objectArray();
	}

	private static void smallArray() {
		int[] arr = { 1, 2, 3 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void printMiddle() {
		int[] arr = { 13, 5, 7, 68, 2 };
		System.out.println(arr[arr.length / 2]);
	}

	private static void cloneString() {
		String[] arr = { "red", "green", "blue", "yellow" };
		System.out.println("Array length: " + arr.length);
		String[] clone = arr.clone();
		System.out.println("Contents of clone: " + Arrays.toString(clone));
	}

	private static void lengthExceptions() {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("First and last values: " + arr[0] + ", " + arr[arr.length - 1]);
		// System.out.println(arr[5]);
		// arr[5] = 6;
	}

	private static void assignValue() {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void assignTwiceValues() {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 2;
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void printNotMiddle() {
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length / 2) {
				System.out.println(arr[i]);
			}
		}
	}

	private static void swapElements() {
		String[] arr = { "red", "green", "blue", "yellow", "orange" };
		System.out.println("Original array: " + Arrays.toString(arr));
		String temp = arr[0];
		arr[0] = arr[arr.length / 2];
		arr[arr.length / 2] = temp;
		System.out.println("Swapped array: " + Arrays.toString(arr));
	}

	private static void sortArray() {
		int[] arr = { 4, 2, 9, 13, 1, 0 };
		System.out.println("Original array: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Array in Ascending order: " + Arrays.toString(arr));
		System.out.println("The smallest number: " + arr[0]);
		System.out.println("The biggest number: " + arr[arr.length - 1]);
	}

	private static void objectArray() {
		Object[] arr = { 2, "red", "green", "blue", 7.2 };
		System.out.println(Arrays.toString(arr));

	}

}
