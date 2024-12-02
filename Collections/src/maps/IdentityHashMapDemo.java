package maps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> ihmap = new IdentityHashMap<>();
		ihmap.put(10, "Bharath");
		ihmap.put(10, "Sarath");
		System.out.println(ihmap);

		Map<Integer, String> hmap = new HashMap<>();
		hmap.put(10, "Bharath");
		hmap.put(10, "Sarath");
		System.out.println(hmap);

		// the above two give same result since integer is small -127to128 hence integer
		// caching takes place but if we make the values bigger

		Map<Integer, String> ihmap2 = new IdentityHashMap<>();
		ihmap2.put(1000, "Bharath");
		ihmap2.put(1000, "Sarath");
		System.out.println(ihmap2);

		Map<Integer, String> hmap2 = new HashMap<>();
		hmap2.put(1000, "Bharath");
		hmap2.put(1000, "Sarath");
		System.out.println(hmap2);

		// now we can see the difference in the output
		// HashMap uses the equals() method for comparing keys and values
		// IdentityHashMap uses the == operator (reference equality) to compare keys and
		// values

	}

}
