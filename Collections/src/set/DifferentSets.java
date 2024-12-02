package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DifferentSets {

	public static void main(String[] args) {

		Random obj = new Random();

		HashSet<Integer> set1 = new HashSet<>();
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		Set<Integer> set3 = new TreeSet<>();

		for (int i = 1; i <= 10; i++) {
			int number = obj.nextInt(100);
			set1.add(number);
			set2.add(number);
			set3.add(number);
			System.out.println(number);
		}

		System.out.println("HashSet elements" + set1);
		System.out.println("LinkedHashSet elements " + set2);
		System.out.println("TreeSet elements " + set3);

		Iterator<Integer> itr = set3.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
			itr.remove();
		}
		System.out.println();
		System.out.println("Set3 is now empty "+set3);

	}

}
