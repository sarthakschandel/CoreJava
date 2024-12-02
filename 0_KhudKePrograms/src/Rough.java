//program to understand the this keyword
//The this keyword refers to the current object, so it prints the default string representation of the object,
// which includes the class name and its hashcode (in hexadecimal form).
public class Rough {
	int x;

	Rough() {
		System.out.println(this); // Rough@59f95c5d classname@hexadecimalformofhashcode
		System.out.println(this.x);//0
		System.out.println(this.hashCode());// 1509514333 normal 32-bit integer hashcode
	}

	public static void main(String[] args) {
		System.out.println("Hello there!");
		new Rough();
		new Rough();//recreated via new hence different hashCode
	}
}
