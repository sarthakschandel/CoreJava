package arraytolistconversions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntArrayToList4 {

	public static void main(String[] args) {

		// method4
		int[] intArray = { 1, 2, 3, 4, 5 };
		List<Integer> integerList = new ArrayList<>(intArray.length);
		for (int i : intArray) {
			integerList.add(i);
		}
		System.out.println(integerList);
	}
}
