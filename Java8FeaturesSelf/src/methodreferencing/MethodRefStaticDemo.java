package methodreferencing;

public class MethodRefStaticDemo {

	public static void myMethod() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}

	}

	public static void main(String[] args) {

		// lambda zindagi
//		Runnable r = () -> {
//			for (int i = 1; i <= 10; i++) {
//				System.out.println("Child Thread");
//			}
//		};
//		Thread t = new Thread(r);
//		t.start();

		// method-referencing zindagi eklauta example
		Runnable r = MethodRefStaticDemo::myMethod;// static hai to className, instance hue to ojectReference
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
