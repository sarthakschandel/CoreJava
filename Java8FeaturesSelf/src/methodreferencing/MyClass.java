package methodreferencing;

public class MyClass {

	public void myMethod(int i) {
		System.out.println(i);
	}// necessary for method referencing

	public static void main(String[] args) {

		// lambda zindagi
		MyInterface f = i -> System.out.println(i);
		f.myMethod(10);

		// method reference zindagi for instance methods example 1
		MyClass obj = new MyClass();
		MyInterface f1 = obj::myMethod;
		f1.myMethod(20);

	}

}
