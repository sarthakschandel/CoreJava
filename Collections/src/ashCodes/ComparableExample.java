package ashCodes;

import java.util.*;

public class ComparableExample {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 25));
		people.add(new Person("Charlie", 35));

		// sort using natural order defined by Comparable(by age)
		Collections.sort(people);

		for (Person person : people) {
			System.out.println(person);
		}
	}

}

class Person implements Comparable<Person> {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "(" + age + ")";
	}

	@Override
	public int compareTo(Person other) {
		return Integer.compare(this.age, other.age);
	}

}
