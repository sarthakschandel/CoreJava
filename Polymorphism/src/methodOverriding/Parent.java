package methodOverriding;

public class Parent {
	String s = "parent";

	public static void doSomething() {
		System.out.println("Parent Method");
	}

	public static void print() {
		System.out.println("Overriding ya hiding?Parent");
	}

	public void kuchbhi() {
		System.out.println("inside parent");
	}

}
