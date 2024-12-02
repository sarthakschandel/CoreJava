package lambdas.basics;

public class Test {

	public static void main(String[] args) {
		
//		regular way
//		A a = new C();// creates interface reference
//		a.myMethod();
		
//		lambda way
		A a = () -> System.out.println("Inside my method");
		a.myMethod();
	}

}
