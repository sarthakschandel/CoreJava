package navigable;

import java.util.TreeSet;

public class NavigableTreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> s = new TreeSet<Integer>();

		for (int i = 10; i < 51; i += 10) {
			s.add(i);
		}
		System.out.println(s);
		System.out.println("Now the set operations begin: ");
		System.out.println(s.ceiling(20));
		System.out.println(s.higher(40));
		System.out.println(s.floor(10));
		System.out.println(s.lower(30));
		System.out.println("Set after 4 operations: " + s);
		System.out.println(s.pollFirst());
		System.out.println("Set after pollFirst: " + s);
		System.out.println(s.pollLast());
		System.out.println("Set after pollLast: " + s);
		System.out.println("Descending set operation in use: " + s.descendingSet());
		System.out.println("Normal Set print will be like this: " + s);

	}

}
