package defaultmethods;

public class Test {

	public static void main(String[] args) {

		A a = new B();
		a.m1();// Inside default method m1 of A interface
		// as of now the B interface has no methods
		// but if we copy the same one in A to B then output changes cause of runtime
		// polymorphism

//		A a1 = new B();
//		a.m1();
		//this prints Inside method m1 of B class

	}

}
