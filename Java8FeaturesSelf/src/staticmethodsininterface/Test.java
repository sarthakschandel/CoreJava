package staticmethodsininterface;

public class Test implements I {

	public static void main(String[] args) {

		Test t = new Test();
//		t.sum(10, 20);
//		Test.sum(10, 20);
		// the above 2 give compile-time errors as sum belongs to Interface and should
		// be called by its name only
		I.sum(10, 20);

	}

}
