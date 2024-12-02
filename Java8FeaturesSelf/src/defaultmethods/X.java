package defaultmethods;

public interface X {

	default void m1() {
		System.out.println("Inside default method m1 of A interface");
	}
	// made to show the diamond problem
	// when Class B implements both A and X
}
