package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		/**
		 * The variable list has a reference type of List<Integer>, but it is backed by
		 * an instance of ArrayList<Integer>. This is an example of polymorphism, where
		 * a parent type (interface) is used to hold a reference to a child type
		 * (class).
		 */
		list.add(new Integer(20));
		list.add(10);// Autoboxing
		list.add(30);
		// list.add("Hello");
		System.out.println(list);

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println(list);

	}

}
