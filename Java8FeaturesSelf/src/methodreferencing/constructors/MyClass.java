package methodreferencing.constructors;

public class MyClass {

	private String s;

	// ...argument type of this must match in order for Constructor Referencing to
	// work
	MyClass(String s) {
		this.s = s;
		System.out.println("Inside the Constructor :" + s);
	}

}
