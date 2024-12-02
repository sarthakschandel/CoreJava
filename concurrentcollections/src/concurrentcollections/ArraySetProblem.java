package concurrentcollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ArraySetProblem extends Thread {
	
//	static HashSet<String> courses = new HashSet<String>();//fail-fast
	static CopyOnWriteArraySet<String> courses = new CopyOnWriteArraySet<String>();//fail-safe
	
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
    	
    	ArraySetProblem arrayListProblem = new ArraySetProblem();
    	arrayListProblem.start();
        
        courses.add("Java");
        courses.add("Python");
        courses.add("AWS");
        courses.add("Docker");
        System.out.println(courses);
        
        Iterator<String> iterator = courses.iterator();
        
        while(iterator.hasNext()) {
        	Thread.sleep(1);
            String course = iterator.next();
            System.out.println(course);
        }
        System.out.println(courses);
    }

}
