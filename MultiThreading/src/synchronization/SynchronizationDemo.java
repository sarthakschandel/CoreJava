package synchronization;

public class SynchronizationDemo {

	// test class to demonstrate sync
	public static void main(String[] args) {
		DisplayMessage dm = new DisplayMessage();// creates DisplayMessage object to pass it as parameter to thread
													// class where the thread class uses it to call the sayHello method

		MyThread t1 = new MyThread(dm, "Steve");// first thread will object to call sayHello() and name
		MyThread t2 = new MyThread(dm, "Mark");// second thread will object to call sayHello() and name

		t1.start();
		t2.start();

	}

}
