package arraytolistconversions;

import java.util.Arrays;
import java.util.List;

public class IntArrayToList3 {

	public static void main(String[] args) {

		// method3
		int[] intArray = { 1, 2, 3, 4, 5 };
		Integer[] integerArray = Arrays.stream(intArray) // Converts to IntStream
				.boxed() // Boxes each int to Integer
				.toArray(Integer[]::new); // Collects to Integer[]
		List<Integer> integerList = Arrays.asList(integerArray);
		System.out.println(integerList);
	}
}
