package defaultmethods;

public interface A {

	default void m1() {
		System.out.println("Inside default method m1 of A interface");
	}

}
