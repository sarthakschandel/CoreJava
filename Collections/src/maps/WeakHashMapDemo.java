package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {

		Map<User, String> map1 = new HashMap<>();
		User u1 = new User();

		map1.put(u1, "Tom");
		System.out.println(map1);// prints {User=Tom}

		u1 = null;// now we point u1 object to null

		System.gc();// calls JVM's garbage collector
		Thread.sleep(5000);// main thread to sleep for 5s, throws exception which either needs to be
							// handled or declared as throws

		System.out.println(map1);// still prints {User=Tom} although we pointed u1 to null
		// this is because the HashMap was still using it as key hence garbage
		// collection didn't work as intended

		Map<User, String> map2 = new WeakHashMap<>();
		User u2 = new User();

		map2.put(u2, "Tom");
		System.out.println(map2);// prints {User=Tom}

		u2 = null;// now we point u1 object to null

		System.gc();// calls JVM's garbage collector
		Thread.sleep(5000);// main thread to sleep for 5s, throws exception which either needs to be
							// handled or declared as throws

		System.out.println(map2);// prints Finalize Called
									// {}
		// it will garbage collect if there are no other objects in the application
		// pointing to the memory location other than the map.

	}

}
