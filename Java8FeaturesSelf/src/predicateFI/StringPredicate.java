package predicateFI;

import java.util.function.Predicate;

public class StringPredicate {

	public static void main(String[] args) {

		Predicate<String> s = (str) -> (str.length() > 5);

		System.out.println(s.test("Sarthak"));
		System.out.println(s.test("xyz"));

	}

}
