package p1;
import static p1.A.*;
import p1.p3.E;

public class B {

	public static void main(String[] args) {
		
		a1();//because of static import we can call without classname :)
		
		A aObject = new A();
		aObject.a2();
		
		E eObject = new E();
		eObject.e1();//calls nested package p1.p3

	}

}
