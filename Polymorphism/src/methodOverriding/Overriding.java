package methodOverriding;

public class Overriding {

	public static void main(String[] args) {
		Parent.doSomething();// Parent Method
		Child.doSomething();// Child Method

		Parent p = new Parent();
		System.out.println(p.s);// parent

		Child c = new Child();
		System.out.println(c.s);// child

		Parent c1 = new Child();// possible as inheritance allows Super Object to access Child
		// Child c3=new Parent();//error hai not possible
		System.out.println(c1.s);/// parent
		// instance variables are not polymorphic in Java. They are resolved at
		// compile-time based on the reference type, not the actual object.

		// method hiding via static methods, hoti hi sirf static methods mein hai
		p.print();// Overriding ya hiding?Parent
		c1.print();// Overriding ya hiding?Parent Call child kiya par hua Parent Hiding Bolte! xD
		c.print();// Overriding ya hiding?Child

		// method hiding non-static mein nahi hui :)
		p.kuchbhi();// inside parent
		c1.kuchbhi();// inside child
		c.kuchbhi();// inside child
	}

}
