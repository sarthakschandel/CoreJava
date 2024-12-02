package ashCodes;

import java.util.TreeMap;

public class NavigableMapDemo {
	public static void main(String[] args) {
	    
	    TreeMap<String, String> tmap = new TreeMap<>();
	    tmap.put("A", "Apple");
	    tmap.put("B", "Boy");
	    tmap.put("C", "Cat");
	    tmap.put("D", "Dog");
    
        System.out.println(tmap.floorKey("C"));
		System.out.println(tmap.lowerKey("B"));
		System.out.println(tmap.ceilingKey("D"));
		System.out.println(tmap.higherKey("A"));
		System.out.println(tmap.pollFirstEntry());
		System.out.println(tmap.descendingMap());
	}
}
