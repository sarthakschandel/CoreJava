package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {

		Random obj = new Random();// creates an object of random class

		List<Integer> list = new ArrayList<>();
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new LinkedHashSet<>();
		Set<Integer> set3 = new TreeSet<>();

		for (int i = 1; i <= 10; i++) {
			int number = obj.nextInt(5);
			System.out.println(number);
			list.add(number);
			set1.add(number);
			set2.add(number);
			set3.add(number);
		}

		System.out.println("List:" + list);
		System.out.println("Set1:" + set1);
		System.out.println("Set2:" + set2);
		System.out.println("Set3:" + set3);

		Set<Integer> set = new HashSet<>(list);
		System.out.println("Example of List to Set conversion:" + set);

	}

}
