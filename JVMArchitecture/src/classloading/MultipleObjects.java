package classloading;

public class MultipleObjects {

	public static void main(String[] args) {

		User u1 = new User();
		Class c1 = u1.getClass();

		User u2 = new User();
		Class c2 = u2.getClass();

		System.out.println(c1.hashCode());// 1940030785
		System.out.println(c2.hashCode());// 1940030785
		System.out.println(c1 == c2);// true

		System.out.println(c1.getClassLoader());// jdk.internal.loader.ClassLoaders$AppClassLoader@7aec35a
		System.out.println(String.class.getClassLoader());// null

	}

}
