package listtoarrayconversions;

import java.util.Arrays;
import java.util.List;

public class IntegerListToIntArray3 {

	public static void main(String[] args) {

		// method3
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
		int[] intArray = Arrays.stream(integerList.toArray(new Integer[0])) // Convert to Integer[]
				.mapToInt(Integer::intValue) // Convert to int
				.toArray();
		System.out.println(Arrays.toString(intArray));
	}
}
