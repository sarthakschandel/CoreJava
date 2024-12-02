public class Test {

	public static void main(String[] args) {

		Product product = new Product(1, "Iphone");

		System.out.println(product);//prints object reference not values
		System.out.println(product.id);//now it prints the data in the object via . dot operator
		System.out.println(product.name);//same as above
		
		String s = "123";
		Integer i = new Integer(456);
		System.out.println(s);
		System.out.println(i);

	}

}
