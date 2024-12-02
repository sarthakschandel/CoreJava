package synchronization.classlock;

public class MyThread extends Thread {

	String name; 
	//no obj field here this time as we dont need an obj to call a static method

	MyThread(String name) {
		this.name = name;
	}

	public void run() {
		DisplayMessage.sayHello(name);//class name used to call static function 
	}
}
