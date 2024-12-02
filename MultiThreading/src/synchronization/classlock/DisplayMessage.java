package synchronization.classlock;

public class DisplayMessage {
	
	//sync class lock demo hence static keyword used in function
	public synchronized static void sayHello(String name) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("How are you " + name);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
