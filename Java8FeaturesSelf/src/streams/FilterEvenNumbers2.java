package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers2 {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			l1.add(i);
		}
		System.out.println(l1);// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

		// normal zindagi
//		List<Integer> l2 = new ArrayList<>();
//		for (Integer i : l1) {
//			if (i % 2 == 0) {
//				l2.add(i);
//			}
//		}

		// functional zindagi
		List<Integer> l2 = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l2);// [0, 2, 4, 6, 8]

		// this class will demonstrate the remaining functions of Stream API
		long count = l1.stream().filter(i -> i % 2 == 0).count();
		System.out.println("Number of even numbers are: " + count);// 5

		// isme sorted mein comparator pel dena to sorted alag ho jayegi
//		Comparator<Integer> comp = (i1,i2)->i1.compare(i2);//nahi chalega
//		Comparator<Integer> comp = (i1, i2) -> i2.compareTo(i1);//descending

		Comparator<Integer> comp = (i1, i2) -> i1.compareTo(i2);// ascending
		List<Integer> l3 = l1.stream().sorted().collect(Collectors.toList());
		System.out.println(l3);// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

		Integer max = l1.stream().max(comp).get();
		System.out.println(max);// 9

		Integer min = l1.stream().min(comp).get();
		System.out.println(min);// 0

		l1.stream().forEach(i -> System.out.println(i));

	}

}
