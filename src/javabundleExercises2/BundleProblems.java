package javabundleExercises2;

import java.util.ArrayList;
import java.util.Arrays;

public class BundleProblems {

	
	public void sortArrays(int[] intArr, String[] stringArr) {
		Arrays.sort(intArr);
		Arrays.sort(stringArr);
	}
	
	public int sumOfArray(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i ++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public void printGrid() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
	
	public double calculateAverage(int[] arr) {
		int sum = sumOfArray(arr);
		double average = (double)sum / arr.length;
		return average;
	}
	
	public boolean contains(int num, int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	public void findMaxMin(int[] arr) {

		int max = arr[0];
		int min = arr[0];
		for(int i = 1; i < arr.length; i ++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}

	ArrayList<String> arrayList = new ArrayList<String>();
}


