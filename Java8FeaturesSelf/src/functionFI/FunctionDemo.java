package functionFI;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<String, Integer> f = (s) -> (s.length());
		System.out.println(f.apply("Sarthak"));//7
		System.out.println(f.apply("Siddhant"));//8
		
	}

}
