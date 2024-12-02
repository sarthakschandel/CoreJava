import java.util.ArrayList;
import java.util.List;

public class TypeCastingProblem {

	public static void main(String[] args) {

		String[] s = new String[10];
		s[0] = "John";
		s[1] = "Rob";
		//s[2] = 123;//arrays are strict

		List<String> l = new ArrayList<>();
		l.add("John");
		l.add("Rob");
		//l.add(123);//now Collections are strict too, thanks to Generics for type safety and type casting 

		String name = (String) l.get(0);
		System.out.println(name);
		String name1 = (String) l.get(1);
		System.out.println(name1);
		//String name2 = (String) l.get(2);

	}

}
