public class ArraysDemo {

	public static void main(String[] args) {

		// int arr[5];//illegal dec
		// int arr[] = {10,20,30,40,50};//ok 
		int arr[] = new int[5];// correct way of declaration and initialization
		System.out.println(arr[0]);
		System.out.println(arr[4]);

		arr[0] = 10;// assignment
		// System.out.println(arr[0].getClass().getSimpleName());
		// cannot invoke on primitive class hence gives errors

		System.out.println(arr.getClass().getSimpleName());// says int[]

		arr[1] = new Integer(20); // Autoboxing
		// arr[2] = 30.54; //datatype mismatch
		arr[2] = 30;

		// arr[7] = 70;//out-of-bound

		System.out.println("Elements of the array:");
		for (int element : arr) {
			System.out.println(element);
		} // for-each loop

	}

}
