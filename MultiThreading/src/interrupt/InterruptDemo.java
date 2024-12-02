package interrupt;

public class InterruptDemo {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();

		//t.interrupt();

		System.out.println("End of the main method");

	}

}
//O/P if line 9 is not commented:
//End of the main method
//I am a lazy thread
//Got Interrupted

//O/P if line 9 is commented:
//End of the main method
//I am a lazy thread
//I am a lazy thread
//I am a lazy thread
//I am a lazy thread
//I am a lazy thread
//I am a lazy thread
//I am a lazy thread
//I am a lazy thread
//I am a lazy thread
//I am a lazy thread
