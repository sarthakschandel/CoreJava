package listtoarrayconversions;

import java.util.List;
import java.util.Arrays;

public class IntegerListToIntArray4 {

	public static void main(String[] args) {

		// method4
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
		int[] intArray = integerList.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(intArray));
	}
}
