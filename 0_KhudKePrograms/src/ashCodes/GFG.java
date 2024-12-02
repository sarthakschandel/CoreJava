package ashCodes;

class MyThread extends Thread {
	public void run() {
		// Code to be executed in this thread
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}
}

public class GFG {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		// Start the threads
		thread1.start();
		thread2.start();
	}
}
