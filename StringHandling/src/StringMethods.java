public class StringMethods {

	public static void main(String[] args) {
		String s = "Hello";

		System.out.println("Length of the string is:" + s.length());
		System.out.println("indexOf:" + s.indexOf('o'));// return the first occurrence
		System.out.println("charAt:" + s.charAt(3));

		System.out.println("substring with beginning index:" + s.substring(2));
		System.out.println("substring with begin and end index:" + s.substring(0, 4));
		System.out.println("substring with begin and end index:" + s.substring(0, 5));
		System.out.println("substring with begin and end index:" + s.substring(1, 4));

		String s1 = "Hello World";

		String[] result = s1.split(" ");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		} // regular for-loop
		for (String word : result) {
			System.out.println(word);
		} // advanced for loop

		System.out.println("replace:" + s1.replace('l', 'k'));
		System.out.println("toUpperCase:" + s1.toUpperCase());
		System.out.println("toLowerCase:" + s1.toLowerCase());

	}
}
