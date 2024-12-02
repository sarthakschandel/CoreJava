package concurrentcollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblemMultiThread extends Thread {

	static CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<>();// copied here so that it becomes a class
																				// field
	// declared static so that it can be used inside main (static mein static hi use
	// ho sakta)

	@Override
	public void run() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courses.add("Kubernetes");
	}

	public static void main(String[] args) throws InterruptedException {

		ArrayListProblemMultiThread arrayListProblem = new ArrayListProblemMultiThread();// obj required for
																							// multi-threading
		arrayListProblem.start();// thread started

		courses.add("Java");
		courses.add("Python");
		courses.add("AWS");
		courses.add("Docker");
		System.out.println(courses);

		Iterator<String> iterator = courses.iterator();

		while (iterator.hasNext()) {
			Thread.sleep(1);
			String course = iterator.next();
			System.out.println(course);
		}
		System.out.println(courses);
	}

}
