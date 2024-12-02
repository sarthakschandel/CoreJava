package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("John", 70);
		map.put("Tom", 60);
		map.put("Lee", 99);
		map.put("Brad", 80);

		// a map has 3 views:

		Set<String> keySet = map.keySet();// 1. set view of keys
		System.out.println("Keys:" + keySet);

		Collection<Integer> values = map.values();// 2. collection view of values
		System.out.println("Values:" + values);

		System.out.println("Key-Value pairs are : " + map.entrySet());// 3. set of key-value pairs

		System.out.println("Iteration via keySet() using foreach");
		for (String key : map.keySet()) {
			System.out.println("Key:" + key + " Value:" + map.get(key));
		} // iteration via keySet using foreach

		System.out.println("Iteration via entrySet() using foreach");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key:" + entry.getKey() + "Value: " + entry.getValue());
		} // iteration via entrySet using foreach

		System.out.println("Iteration via entrySet() using iterator");
		Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println("Key:" + entry.getKey() + "Value:" + entry.getValue());
		} // iteration via entrySet using iterator

	}

}
