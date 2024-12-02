package concurrentcollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread {

//	static HashMap<String,String> courseRatings = new HashMap<String,String>();//fail-fast
	static ConcurrentHashMap<String,String> courseRatings = new ConcurrentHashMap<String,String>();//fail-safe
	
	@Override
	public void run() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courseRatings.put("Kubernetes","4.8");
	}

    public static void main(String[] args) throws InterruptedException {
    	
    	ConcurrentHashMapDemo arrayListProblem = new ConcurrentHashMapDemo();
    	arrayListProblem.start();
        
        courseRatings.put("Java","5.0");
        courseRatings.put("Python","4.8");
        courseRatings.put("AWS","4.7");
        courseRatings.put("Docker","4.7");
        System.out.println(courseRatings);//{Java=5.0, Docker=4.7, AWS=4.7, Python=4.8}
        
        Iterator<String> iterator = courseRatings.keySet().iterator();
        
        while(iterator.hasNext()) {
        	Thread.sleep(1);
            String course = iterator.next();
            System.out.println(course + courseRatings.get(course));
        }
        
        for(Map.Entry<String,String> entries : courseRatings.entrySet()) {
        	System.out.println(entries.getKey()+entries.getValue());
        }
        System.out.println(courseRatings.entrySet());//[Java=5.0, Docker=4.7, AWS=4.7, Python=4.8, Kubernetes=4.8]
        System.out.println(courseRatings);//{Java=5.0, Docker=4.7, AWS=4.7, Python=4.8, Kubernetes=4.8}
    }

}
