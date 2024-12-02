package random;

import java.util.Random;

public class RandomDemo {
	
	public static void main(String[] args) {
		
		Random obj = new Random();
		
		int x = obj.nextInt();
		System.out.println("X: " + x);
		
		int y = obj.nextInt(100);// generates random number within given range
		System.out.println("Y: " + y);
		
		int z = obj.nextInt(10000);// generates random number within given range
		System.out.println("Z: " + z);

	}
}
