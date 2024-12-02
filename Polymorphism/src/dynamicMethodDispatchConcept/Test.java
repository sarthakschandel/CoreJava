package dynamicMethodDispatchConcept;

public class Test {
	public static void main(String args[]) {
		Animal a;
		a= new Dog();
		a.sound();
		a= new Cat();
		a.sound();
	}
}
/** when a method is called on a reference variable, the JVM determines which method to execute based on the actual object type at runtime, not the reference type. This is where dynamic method dispatch comes into play, the JVM dynamically selects the method to be called /executed at runtime based on the object that the reference points to!  */