package lambdas.paramters;

public class Test {

	public static void main(String[] args) {
		Sum s =(x,y)->System.out.println("Sum is: "+(x+y));
		s.add(100, 200);
	}

}
