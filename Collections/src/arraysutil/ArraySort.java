package arraysutil;

import java.util.Arrays;
import java.util.List;

public class ArraySort {

	public static void main(String[] args) {

		int[] a = { 40, 10, 15, 7 };

		System.out.println("Before sort");
		for (int eachElement : a) {
			System.out.print(eachElement + " ");
		}
		System.out.println();

		Arrays.sort(a);

		System.out.println("After sort");
		for (int eachElement : a) {
			System.out.print(eachElement + " ");
		}
		System.out.println();

		String[] s = { "V", "A", "Z", "P" };

		//// String array sort naturally
		Arrays.sort(s);
		for (String eachString : s) {
			System.out.print(eachString + " ");
		}
		System.out.println();

		// String array sort with Comparator which will reverse 
		Arrays.sort(s, new MyComparator());
		for (String eachString : s) {
			System.out.print(eachString + " ");
		}
		System.out.println();

		List<String> list = Arrays.asList(s);
		s[1] = "Y";
		//list.add("O");
		//we cannot perform operations that change the size of the array after we convert it to list
		System.out.println(list);

	}

}
