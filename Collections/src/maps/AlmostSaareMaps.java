package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AlmostSaareMaps {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> lhmap = new LinkedHashMap<>();
		Map<String, Integer> tmap = new TreeMap<>();

		map.put("John", 70);
		map.put("Tom", 60);
		map.put("Lee", 99);
		map.put("Brad", 80);

		lhmap.put("John", 70);
		lhmap.put("Tom", 60);
		lhmap.put("Lee", 99);
		lhmap.put("Brad", 80);

		tmap.put("John", 70);
		tmap.put("Tom", 60);
		tmap.put("Lee", 99);
		tmap.put("Brad", 80);

		Set<String> keySet1 = map.keySet();
		System.out.println("NO ORDER Keys:" + keySet1);
		Set<String> keySet2 = lhmap.keySet();
		System.out.println("INSERTION ORDER Keys:" + keySet2);
		Set<String> keySet3 = tmap.keySet();
		System.out.println("NATURAL ORDER Keys:" + keySet3);

		System.out.println("In HashMap this happens NO ORDER :");
		for (String key : keySet1) {
			System.out.println("Key:" + key + " Value:" + map.get(key));
		}
		System.out.println("In LinkedHashMap this happens INSERTION ORDER :");
		for (String key : keySet2) {
			System.out.println("Key:" + key + " Value:" + map.get(key));
		}
		System.out.println("In TreeMap this happens NATURAL ORDER :");
		for (String key : keySet3) {
			System.out.println("Key:" + key + " Value:" + map.get(key));
		}

	}

}