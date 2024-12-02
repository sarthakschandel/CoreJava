package itrExample;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	    public static void main(String[] args) {
	        ArrayList<String> names = new ArrayList<>();
	        names.add("Alice");
	        names.add("Bob");
	        names.add("Charlie");

	        // Getting the iterator from the collection
	        Iterator<String> itr = names.iterator();

	        // Iterating through the collection
	        while (itr.hasNext()) {
	            String name = itr.next();
	            System.out.println(name);

	            // Optionally remove an element
	            if (name.equals("Bob")) {
	                itr.remove();
	            }
	        }

	        System.out.println("Remaining names: " + names);
	    }
}
