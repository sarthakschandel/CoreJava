public class MultiThreaded extends Thread {

	public static void main(String[] args) throws InterruptedException {

		MultiThreaded mt = new MultiThreaded();// class object created to start thread, this class extends Thread class
												// :)
		mt.setPriority(MAX_PRIORITY);
		mt.setName("mt");
		mt.start();//

		MultiThreaded mt1 = new MultiThreaded();
		mt1.setPriority(MIN_PRIORITY);
		mt1.setName("mt1");
		mt1.start();//starts the Thread

		/*
		 * for (int j = 1; j <= 200; j++) { System.out.print("j: " + j + "\t");
		 * Thread.sleep(1000); }
		 */
	}

	public void run() {
		//the starting point of the Thread
		System.out.println("Thread Name: " + Thread.currentThread().getName());

		/*
		 * for (int i = 1; i <= 200; i++) { System.out.print("i: " + i + "\t");
		 * try { Thread.sleep(1000); } catch (InterruptedException e) {
		 * System.out.println("Child Thread Exiting"); }
		 * 
		 * }
		 */
	}

}
