package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		Object objects[] = new Object[1000000];

		for (int i = 0; i < objects.length; i++) {
			objects[i] = new Object();
		}

		List<Object> list = new ArrayList<>();
		long start = System.currentTimeMillis();
		for (Object object : objects) {
			list.add(object);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time Taken for ArrayList:" + (end - start));

		List<Object> ll = new LinkedList<>();
		long startll = System.currentTimeMillis();
		for (Object object : objects) {
			ll.add(object);
		}
		long endll = System.currentTimeMillis();
		System.out.println("Time Taken for LinkedList:" + (endll - startll));

	}

}
