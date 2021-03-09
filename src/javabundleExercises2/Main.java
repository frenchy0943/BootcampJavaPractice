package javabundleExercises2;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		BundleProblems bp = new BundleProblems();
		int[] my_array1 = {
				 1789, 2035, 1899, 1456, 2013,
				 1458, 2458, 1254, 1472, 2365,
				 1456, 2165, 1457, 2456};

		 String[] my_array2 = {
				 "Java",
				 "Python",
				 "PHP",
				 "C#",
				 "C Programming",
				 "C++"
				 };
		 bp.sortArrays(my_array1, my_array2);
		 System.out.println(Arrays.toString(my_array1));
		 System.out.println(Arrays.toString(my_array2));
		 
		 int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 System.out.println(bp.sumOfArray(my_array));
		 
		 bp.printGrid();
		 
		 int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
		 System.out.println(bp.calculateAverage(numbers));
		 
		 System.out.println(bp.contains(1254, my_array1));
		 System.out.println(bp.contains(7, my_array1));
		 
		 int[] my_array3 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		 bp.findMaxMin(my_array3);
	}

}
