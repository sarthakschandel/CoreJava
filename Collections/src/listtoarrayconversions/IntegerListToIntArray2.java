package listtoarrayconversions;

import java.util.Arrays;
import java.util.List;

public class IntegerListToIntArray2 {

	public static void main(String[] args) {

		// method2
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
		int[] intArray = new int[integerList.size()];

		for (int i = 0; i < integerList.size(); i++) {
			intArray[i] = integerList.get(i); // Unboxing Integer to int
		}

		System.out.println(Arrays.toString(intArray));
	}
}
