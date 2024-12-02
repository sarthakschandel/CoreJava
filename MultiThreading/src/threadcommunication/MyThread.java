package threadcommunication;

public class MyThread extends Thread {

	int total;

	@Override
	public void run() {
		System.out.println("Child Thread is calculating the sum:");
		
		//the lock then gets onto this to calculate the sum
		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				total += i;
			}
			this.notify();//notifies about lock release, and wakes the thread that called wait()
		}
	}
}
