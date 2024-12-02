
public class Test {

	static ArrayIndexOOBDemo a;

	public static void main(String[] args) {

//		ArrayIndexOOBDemo a = new ArrayIndexOOBDemo();
		try {
			Test.a.method1();
		} catch (NullPointerException e) {
			System.out.println("NullPointerException has occured :O");
		} finally {
			System.out.println("This is the finally code ");
		}
//		a.method1();

	}
}
//uncomment the commented lines and comment the 2 obvious ones including the try-catch to see the NullPointerException :)