package listtoarrayconversions;

import java.util.Arrays;
import java.util.List;

public class IntegerListToIntArray {

	public static void main(String[] args) {

		// method1
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
		int[] intArray = integerList.stream().mapToInt(Integer::intValue) // Unboxes Integer to int
				.toArray();
		System.out.println(Arrays.toString(intArray));
	}
}
