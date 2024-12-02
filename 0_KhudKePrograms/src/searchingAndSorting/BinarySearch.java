package searchingAndSorting;

//import java.util.Arrays;

public class BinarySearch {
	// binary search = Search algorithm that finds the position
	// of a target value within a sorted array.
	// Half of the array is eliminated during each "step"
	//time complexity is 0(logn)
	public static void main(String[] args) {
		int array[] = new int[1000000];
		int target = 777777;
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		// this is the built-in function provided by the Arrays library, returns the
		// index of the target otherwise -1
		// int index = Arrays.binarySearch(array, target);
		int index = binarySearch(array, target);

		if (index == -1) {
			System.out.println(target + " not found");
		} else {
			System.out.println("Element found at: " + index);
		}
	}

	private static int binarySearch(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			// int middle = (low + high) / 2; avoided as this may cause integer overflow if
			// low and high are large integer values
			int middle = low + (high - low) / 2; // this is more optimal and correct method
			int value = array[middle];
			System.out.println("middle: " + value);
			if (value < target)
				low = middle + 1;
			else if (value > target)
				high = middle - 1;
			else
				return middle; // target found
		}
		return -1;
	}
}
