package methodHidingMain;

public class Child extends Parent{
	public static void main(String[] args) {
		System.out.println("Child Main Method");
	}
}
//if we run as Java application in class B, then it calls the child's main which overrides the parent's //main