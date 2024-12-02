package predicateFI;

import java.util.function.Predicate;

public class IntegerPredicate {

	public static void main(String[] args) {

		Predicate<Integer> p = (i) -> i > 20;// predicate that checks number greater than 20

		System.out.println(p.test(10));
		System.out.println(p.test(25));
		System.out.println(p.test(69));

	}

}
