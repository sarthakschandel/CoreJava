package defaultmethods;

public class B implements A,X {

	// default methods are only allowed in interfaces
	//we have provide the overridden implementation of m1() in B 
	//so as to avoid the diamond problem
	public void m1() {
		System.out.println("Inside method m1 of B class");
	}

}
