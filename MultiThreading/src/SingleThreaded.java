public class SingleThreaded {

	public static void main(String[] args) {
		
		//main is the 1st thread the JVM creates
		SingleThreaded st = new SingleThreaded();
		st.printNumbers();

		for (int j = 1; j <= 200; j++) {
			System.out.print("j: " + j + "\t");
		}

	}

	void printNumbers() {
		for (int i = 1; i <= 200; i++) {
			System.out.print("i: " + i + "\t");
		}
	}

}
