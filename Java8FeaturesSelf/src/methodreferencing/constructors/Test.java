package methodreferencing.constructors;

public class Test {

	public static void main(String[] args) {

		MyInterface f1 = s -> new MyClass(s);
		f1.get("Using Lambda Expression");

		MyInterface f2 = MyClass::new;
		f2.get("Using Constructor Method Referencing");

	}

}
