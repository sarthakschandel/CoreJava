package synchronization.classlock;

public class SynchronizationDemo {
	
	//test class to demonstrate sync class level lock
	public static void main(String[] args) {

		MyThread t1 = new MyThread("Steve");//hence no obj as parameter here also
		MyThread t2 = new MyThread("Mark");

		t1.start();
		t2.start();

	}

}
