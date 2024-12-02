package assignmentProblem;

public class Test {

	public static void main(String[] args) {
		/*
		 * Interface Type Reference: 
		 * The hpLaptop variable is of type TouchScreenLaptop,
		 * which is an interface. It means the variable can store a reference to any
		 * object of a class that implements TouchScreenLaptop. 
		 * Object Creation: The new
		 * HPNotebook() part creates an object of the HPNotebook class. 
		 * Polymorphism:
		 * Even though the reference type is TouchScreenLaptop, the actual object it
		 * points to is an instance of HPNotebook. So, when you call a method like
		 * click() on hpLaptop, it will call the implementation in HPNotebook.
		 **/
		TouchScreenLaptop ob1 = new HPNoteBook();
		ob1.click();
		ob1.scroll();
		TouchScreenLaptop ob2 = new DellNoteBook();
		ob2.click();
		ob2.scroll();
	}

}
