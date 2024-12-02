//understanding wrapper classes and how to print object values
public class PrimitiveAndObject {

	int a;
	int b = 69;

	public static void main(String[] args) {

		int x = 100;
		System.out.println(x);
		Integer y = Integer.valueOf(x);
		System.out.println(y);
		int z = y.intValue();
		System.out.println(z);

		PrimitiveAndObject obj = new PrimitiveAndObject();
		System.out.println(obj);//PrimitiveAndObject@15db9742
		System.out.println(obj.a);//0
		System.out.println(obj.b);//69
	}
}
