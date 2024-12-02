package immutable;

public class StringPoolDemo {

	public static void main(String[] args) {

		User user1 = new User(1, "abc");
		User user2 = new User(1, "abc");

		System.out.println(user1);
		System.out.println(user2);

		String s1 = "abc";
		String s2 = "xyz";
		String s3 = "abc";
		String s4 = new String("abc");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		// The hashCode() method in the String class is overridden to generate a hash
		// code based on the content of the string, not its memory address.
		// This means that two String objects that have the same sequence of characters
		// will produce the same hash code, even if they are different objects in
		// memory.

		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));
		// The == operator checks if two references point to the exact same object in
		// memory.
		// In our case:
		// s1 is a string literal stored in the string pool.
		// s4 is created using new String("abc"), which creates a new object in the
		// heap, separate from the string pool.

		System.out.println(user1 == user2);
		System.out.println(user1.equals(user2));

	}

}
