package methodreferencing;

public class MethodRefInstanceDemo {

	public void myMethod() {
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

		// method-referencing zindagi for instance methods example 2
		MethodRefInstanceDemo obj = new MethodRefInstanceDemo();
		Runnable r = obj::myMethod;// instance hai to objRef, instance hota to Classname
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
