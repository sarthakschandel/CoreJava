
public class ObjectAndString {

	public static void main(String[] args) {

		long x = 1000;
		System.out.println(x);

		Long y = Long.valueOf(x);// primitive to object
		System.out.println(y.getClass().getSimpleName());
		System.out.println(y);

		String s = y.toString();// object to string
		System.out.println(s.getClass().getSimpleName());
		System.out.println(s);

		Long z = Long.valueOf(s);// string to object
		System.out.println(z.getClass().getSimpleName());
		System.out.println(z);

		long z1 = Long.parseLong(s);//string object to primitive
		System.out.println(z1);
	}

}
