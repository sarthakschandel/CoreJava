package methodHidingMain;

public class MainOverload {

	public static void main(String[] args) {
		System.out.println("Default Main Method");
		main(10);
	}// JVM by default calls the main with this function signature
		// other main need to be called

	public static void main(int args) {
		System.out.println("Overloaded Main Method");
	}

}
