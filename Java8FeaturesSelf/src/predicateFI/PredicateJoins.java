package predicateFI;

import java.util.function.Predicate;

public class PredicateJoins {

	public static void main(String[] args) {

		int x[] = { 0, 7, 10, 20, 30, 40, 50, 60, 70, 75 };

		Predicate<Integer> p1 = (i) -> (i > 10);
		Predicate<Integer> p2 = (i) -> (i % 2 == 0);

		System.out.println("The values in the array are:");// 0 7 10 20 30 40 50 60 70 75
		for (int value : x) {
			System.out.print(value + " ");// print for single line
		}
		System.out.println();// println for next line to be a separate line

		System.out.println("Greater than 10:");
		method1(p1, x);// 20 30 40 50 60 70 75

		System.out.println("Even numbers:");
		method1(p2, x);// 0 10 20 30 40 50 60 70

		System.out.println("Not greater than 10:");
		method1(p1.negate(), x);// 0 7 10

		System.out.println("Odd numbers:");
		method1(p2.negate(), x);// 7 75

		System.out.println("Greater than 10 and Even:");
		method1(p1.and(p2), x);// 20 30 40 50 60 70

		System.out.println("Greater than 10 or Even:");
		method1(p1.or(p2), x);// 0 10 20 30 40 50 60 70 75
	}

	static void method1(Predicate<Integer> pred, int arr[]) {
		for (int eachValue : arr) {
			if (pred.test(eachValue)) {
				System.out.print(eachValue + " ");
			}
		}
		System.out.println();
	}

}
