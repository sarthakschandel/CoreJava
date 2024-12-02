package arraytolistconversions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntArrayToList {

	public static void main(String[] args) {

		// method1
		int[] intArray = { 1, 2, 3, 4, 5 };
		List<Integer> integerList = Arrays.stream(intArray) // Creates an IntStream from the array
				.boxed() // Converts each int to Integer
				.collect(Collectors.toList()); // Collects to a List
		System.out.println(integerList);
	}
}
