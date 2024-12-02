package assignment;

public class EventNumberThread implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
