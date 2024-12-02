package immutable;

public class Test {

	public static void main(String[] args) {

		User user = new User(1, "John");
		System.out.println(user);
		System.out.println(user.getClass().getSimpleName());

		String s = new String("Bharath");
		System.out.println(s);
		System.out.println(s.getClass().getSimpleName());

		Integer i = new Integer(30);
		System.out.println(i);
		System.out.println(i.getClass().getSimpleName());// Integer hai, int nahi :)

	}

}
