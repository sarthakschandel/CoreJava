package stringbuilder;

public class SB2 {

	public static void main(String[] args) {

		// Create a StringBuilder object
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb.getClass().getSimpleName());

		// Append a string to the StringBuilder
		sb.append(" World");
		System.out.println("After append: " + sb); // Output: Hello World

		// Insert a string at a specified index
		sb.insert(5, ",");
		System.out.println("After insert: " + sb); // Output: Hello, World

		// Replace a part of the string
		sb.replace(6, 7, "-");
		System.out.println("After replace: " + sb); // Output: Hello,-World

		// Delete a part of the string
		sb.delete(5, 6);
		System.out.println("After delete: " + sb); // Output: Hello-World

		// Reverse the string
		sb.reverse();
		System.out.println("After reverse: " + sb); // Output: dlroW-olleH

		// Get the length of the StringBuilder
		int length = sb.length();
		System.out.println("Length: " + length); // Output: 11

		// Get the capacity of the StringBuilder
		int capacity = sb.capacity();
		System.out.println("Capacity: " + capacity); // Output: 27 (this may vary)

	}

}
