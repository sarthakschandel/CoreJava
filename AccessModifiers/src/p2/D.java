package p2;

import p1.A;

public class D {

	public static void main(String[] args) {
		// assignment by instructor
		A aObj = new A();// creating A's object since we want to use A's members
		System.out.println(aObj.d);// only be able to access d since its public
	}

}
