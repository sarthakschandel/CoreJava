import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = "six";
		System.out.println(s1);// six

		String s2 = new String("seven");
		System.out.println(s2);// seven

		char c[] = { 'a', 'e', 'i', 'o', 'u' };
		System.out.println(c);// aeiou
		// c is a character array (char[]), and when you pass a char[] to
		// System.out.println(), Java treats it specially. Instead of printing the
		// array’s reference (like it would for int[] or other object arrays), it prints
		// the contents of the character array as a string.
		String s3 = new String(c);
		System.out.println(s3);// aeiou
		System.out.println(s3.charAt(0));// a

		byte b[] = { 65, 66, 67 };
		System.out.println(b);// [B@15db9742
		// b is a byte array (byte[]). Unlike char[], where printing the array directly
		// prints the characters in the array, when you print a byte array, Java doesn't
		// know how to treat the bytes as characters automatically. Instead, it prints
		// the reference or memory address of the array object, not the content.
		String s4 = new String(b);
		// When you use the new String(byte[] b) constructor, Java converts the byte
		// values to characters using the default platform character encoding (usually
		// UTF-8 or ISO-8859-1 depending on your system). Each byte value in the array
		// is treated as a corresponding ASCII character.
		System.out.println(s4);// ABC

		int i[] = { 65, 66, 67 };
		System.out.println(i);// [I@6d06d69c
//		String s5i = new String(i); //doesnt behave like the char byte array
//		System.out.println(s5i);
		String s5 = new String(Arrays.toString(i));
		System.out.println(s5);// [65, 66, 67]
		System.out.println(s5.charAt(0));// [
		System.out.println(s5.charAt(1));// 6
		System.out.println(s5.charAt(2));// 5

		// System.out.println(s1.getClass().getSimpleName());

		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		System.out.println(l);// simply for printing list [1, 2]

		String s6[] = { "Sarthak", "Aarav", "Randeep" };
		List<String> k = Arrays.asList(s6);
		System.out.println(k);// [Sarthak, Aarav, Randeep]
	}

}
