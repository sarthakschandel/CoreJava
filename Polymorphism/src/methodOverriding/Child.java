package methodOverriding;

public class Child extends Parent {
	String s = "child";

	public static void doSomething() {
		System.out.println("Child Method");
	}

	public static void print() {
		System.out.println("Overriding ya hiding?Child");
	}

	public void kuchbhi() {
		System.out.println("inside child");
	}
}
