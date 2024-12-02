package set;

import java.util.Set;
import java.util.TreeSet;

import comparator.StringComparator;

public class StringTreeSet {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>();// sorts in natural order
		set.add("abcxyz");
		set.add("abcxyy");
		set.add("abcxyza");
		set.add("xyzabcde");
		set.add("defzzzzzzzzzzzzz");
		set.add("mno");

		for (String obj : set) {
			System.out.println(obj);
		}

		Set<String> set1 = new TreeSet<>(new StringComparator());// sorts in the order as defined in Comparator, length
																	// in this case that to descending order
		set1.add("abcxyz");
		set1.add("abcxyy");
		set1.add("abcxyza");
		set1.add("xyzabcde");
		set1.add("defzzzzzzzzzzzzz");
		set1.add("mno");

		for (String string : set1) {
			System.out.println(string);
		}
	}

}
/**
 * Output is: defzzzzzzzzzzzzz xyzabcde abcxyza abcxyz mno
 */
