package methodHidingStatic;

public class Test {                                   
	public static void main(String args[]) {
		Parent p = new Parent();
		p.show();
		Parent pc = new Child();
		pc.show();
		Child c = new Child();
		c.show();
	}
}
