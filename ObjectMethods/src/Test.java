public class Test {

	public static void main(String[] args) {

		Passenger passenger = new Passenger();
		passenger.setFirstName("Bharath");
		passenger.setLastName("Thippireddy");
		passenger.setId(123);

		Passenger passenger2 = new Passenger();
		passenger2.setFirstName("Sarthak");
		passenger2.setLastName("Singh Chandel");
		passenger2.setId(456);

		Passenger passenger3 = new Passenger();
		passenger3.setFirstName("Bharath");
		passenger3.setLastName("Thippireddy");
		passenger3.setId(123);

		System.out.println(passenger);
		System.out.println(passenger2);
		System.out.println(passenger3);

		System.out.println(passenger.equals(passenger2));
		System.out.println(passenger.equals(passenger3));// we have overridden the equals() otherwise this too would
															// have been false
		// since memory ref is different as they are 2 diff objects

	}

}
