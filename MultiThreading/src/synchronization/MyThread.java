package synchronization;

public class MyThread extends Thread {

	DisplayMessage dm;//object field
	String name;//name field

	MyThread(DisplayMessage dm, String name) {
		this.dm = dm;
		this.name = name;
	}
	
	public void run(){
		dm.sayHello(name);
	}
}
