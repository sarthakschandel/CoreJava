package interfaces;

public interface Car{
	//the compiler by default makes these methods public and abstract
	void go();
	void stop();
	
	//kuch bhi ho sakta hai
	static void petrol() {
		System.out.println("fuck u");
	}
}