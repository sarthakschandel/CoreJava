package lambdas.interfaces;

public class Test {

	public static void main(String[] args) {
//		normal zindagi
		// Runnable r = new MyRunnableImpl();
		// Thread t = new Thread(r);
		// t.start();

//		functional zindagi
		Runnable r = () -> {

			for (int i = 1; i <= 10; i++) {
				System.out.println("Child Thread");
			}

		};

		Thread t = new Thread(r);
		t.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
