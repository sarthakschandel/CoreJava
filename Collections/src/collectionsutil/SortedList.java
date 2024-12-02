package collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {
	public static void main(String[] args) {

		List<String> l = new ArrayList<>();

		l.add("Z");
		l.add("M");
		l.add("P");
		l.add("A");
		l.add("X");
		l.add("B");
		System.out.println("Before Sorting: " + l);

		Collections.sort(l);// natural sorting
		System.out.println("After Sorting: " + l);
		int result = Collections.binarySearch(l, "C");
		System.out.println("Index is: " + result);

		Collections.sort(l, new MyComparator());// custom sorting by overriding the compare method
		System.out.println("After Customm Sorting: " + l);
//		result = Collections.binarySearch(l, "C");
//		System.out.println("Index is: " + result);
//		IF we want to binarySearch via custom comparator we have to pass in the comparator in the bS function CTRL+1 for more info

	}

}
