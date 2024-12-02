

//Example of a class implementing Cloneable
class Person implements Cloneable {
	String name;
	int age;

	// Constructor
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Overriding the clone method to enable cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CloningExample {
	public static void main(String[] args) {
		try {
			// Creating an original object
			Person original = new Person("John", 25);
			int a = original.hashCode();
			// Cloning the original object
			Person clone = (Person) original.clone();
			int b = clone.hashCode();

			// Displaying the cloned object
			System.out.println("Original: " + original.name + ", " + original.age + ", " + a);
			System.out.println("Clone: " + clone.name + ", " + clone.age + ", " + b );

			// Modifying the clone to demonstrate shallow copy
			clone.name = "Jane";

			// Observe that only the clone's name changes
			System.out.println("Modified Clone: " + clone.name + ", " + clone.age);
			System.out.println("Original after clone modification: " + original.name + ", " + original.age);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
