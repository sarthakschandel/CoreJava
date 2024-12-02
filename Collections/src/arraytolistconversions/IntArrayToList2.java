package arraytolistconversions;

import java.util.ArrayList;
import java.util.List;

public class IntArrayToList2 {

	public static void main(String[] args) {

		// method2
		int[] intArray = { 1, 2, 3, 4, 5 };
		List<Integer> integerList = new ArrayList<>();
		for (int i : intArray) {
			integerList.add(i); // Autoboxing converts int to Integer
		}
		System.out.println(integerList);
	}
}
