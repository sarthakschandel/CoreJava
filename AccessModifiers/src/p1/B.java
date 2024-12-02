package p1;

public class B {

	public static void main(String[] args) {

		A aObject = new A();// jiske member use karne honge uss class ka hi object banana hoga
//		System.out.println(aObject.a); //Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//		The field A.a is not visible
		System.out.println(aObject.b);
		System.out.println(aObject.c);
		System.out.println(aObject.d);

	}

}
