package ashCodes;

import java.util.*;

public class ComparatorExample extends AgeComparator {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 25));
		people.add(new Person("Charlie", 35));

		// sort using AgeComparator
		Collections.sort(people, new AgeComparator());

		for (Person person : people) {
			System.out.println(person);
		}
	}

}

//class Person {
//	String name;
//	int age;
//
//	Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//
//	@Override
//	public String toString() {
//		return name + "(" + age + ")";
//	}
//
//}

class AgeComparator implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		return Integer.compare(p1.age, p2.age);
	}
}