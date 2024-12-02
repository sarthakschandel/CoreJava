package p2;

import p1.A;//importing the package p1 so that we can use class A's members when we use inheritance

public class C extends A {

	public static void main(String[] args) {
		A aObject = new A();
		System.out.println(aObject.d);// a b cant be since private and default, c can be as its protected but thru C's
										// object only

		C cObject = new C();
		System.out.println(cObject.c);
		System.out.println(cObject.d);

	}

}
