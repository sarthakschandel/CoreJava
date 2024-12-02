package immutable;

public class ImmutableDemo {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";
		String s3 = s1;// creating copy but it is not used anywhere!
		System.out.println(s3);

		System.out.println("Before Concat:" + "\ns1:" + s1 + "\ns2:" + s2);
		s2 = s1.concat(s2);
		System.out.println("After Concat:" + "\ns1:" + s1 + "\ns2:" + s2);

		// reversing a string
		String rev = "";
		for (int i = 0; i < s1.length(); i++) {
			rev = s1.charAt(i) + rev;
		}
		System.out.println("Reversed String is : " + rev);
	}

}
