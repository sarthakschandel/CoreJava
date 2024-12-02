import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		for(Integer element : list) {
			System.out.print(element + " ");
		}
		
		System.out.println();
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}

}
