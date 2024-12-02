package synchronization.blocks;

public class DisplayMessage {

	public void sayHello(String name) {
		// Any code can go here
		System.out.println("This line of code is not synchronized and other threads can access it, no lock");

		// demonstrate the sync on block using the current object
		/*
		 * within brackets we can specify which object needs to be locked or which class
		 * needs to be locked. Its synchronized and we'll close it after the for loop.
		 * This way, whichever thread enters into this synchronized block first will
		 * attain a lock on the object that invokes this method. And until that thread
		 * finishes this synchronized block execution, no other thread can enter into
		 * this block.
		 */
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println("How are you " + name);
				try {
					Thread.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
/* Output may differ but I got this one time, showing the sync and non-sync in action
 * This line of code is not synchronized and other threads can access it, no lock
How are you Steve
This line of code is not synchronized and other threads can access it, no lock
How are you Steve
How are you Steve
How are you Steve
How are you Steve
How are you Steve
How are you Steve
How are you Steve
How are you Steve
How are you Steve
How are you Mark
How are you Mark
How are you Mark
How are you Mark
How are you Mark
How are you Mark
How are you Mark
How are you Mark
How are you Mark
How are you Mark
 */
