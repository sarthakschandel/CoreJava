package threadcommunication;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {

		MyThread t = new MyThread();
		t.start();//thread starts
		
		//gets lock here
		synchronized (t) {
			System.out.println("Main thread is going to wait");
			t.wait();//releases the lock in order to get sum calculated fully
			System.out.println("Main Thread Notified");//notify() se idhar aaye phir
			System.out.println(t.total);
		}

	}

}
