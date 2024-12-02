
public class ashThread extends Thread {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		Thread currentThread = Thread.currentThread();// returns the current executing thread
//		System.out.println("Thread name is " + currentThread.getName());

		ashThread at = new ashThread();// class object created to start thread, this class extends Thread class :)
		at.setPriority(MAX_PRIORITY);
//		at.setPriority(MIN_PRIORITY);
		at.start();

		System.out.println("Thread name is " + currentThread.getName());// getName to get the name of the executing
																		// thread

		try {
			at.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();
		System.out.println("The total time taken is " + (end - start) / 1000 + " Seconds.");
		System.out.println("The total time taken is " + (end - start) + " Milli-Seconds.");
	}

	public void run() {
		Thread currentThread = Thread.currentThread();
//		currentThread.setName("Printing numbers");
		System.out.println("Thread name is " + currentThread.getName());

		for (int i = 0; i < 50; i++) {
			System.out.print("i:" + i + "\t");
			try {
				Thread.sleep(10);
				// Thread.sleep(100);
				// Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();

		System.out.println("Thread name is " + currentThread.getName());
		currentThread.setName("Printing numbers");
		System.out.println("Thread name is " + currentThread.getName());
	}
}
