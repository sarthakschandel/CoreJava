public class CheckProcessor implements Runnable {

	@Override
	public void run() {
		System.out.println("Processed the checks");

	}

	public static void main(String[] args) {

		CheckProcessor cp = new CheckProcessor();

		Thread t = new Thread(cp);//Thread instance is created and runnable interface reference is passed!
		t.start();//the function calls will e through thread object only.

	}

}
