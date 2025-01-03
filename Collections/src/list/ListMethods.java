package list;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 10; i <= 100; i = i + 10) {
			list.add(i);
		}
		System.out.println("List:" + list);

		// add at specific index
		list.add(2, 100);
		System.out.println("List After Insert:" + list);

		// replace at specific index
		list.set(3, 200);
		System.out.println("List After Replacement:" + list);

		List<Integer> secondList = new ArrayList<>();
		secondList.add(111);
		secondList.add(222);
		secondList.add(333);
		System.out.println("Second List:" + secondList);

		// list.addAll(secondList); adds at the end of the list
		list.addAll(4, secondList);// adds at specific index
		System.out.println("First List" + list);

		// checks if present or not
		if (list.contains(222)) {
			System.out.println("List has the value");
		} else {
			System.out.println("List does not have the value");
		}

		System.out.println("Elements in the list are:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		list.remove(3);
		System.out.println("List after deletion" + list);

	}
}
