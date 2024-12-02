package udemyProblem;

public class TestElectricityBill {

	public static void main(String[] args) {

		ElectricityBill bill1 = new ElectricityBill();
		ElectricityBill bill2 = new ElectricityBill();
		ElectricityBill bill3 = new ElectricityBill();

		bill1.setMeterNo(12345);
		bill1.setAddress("Ex. Bahar");
		bill1.setName("Sarthak");

		bill2.setMeterNo(67890);
		bill2.setAddress("BKT");
		bill2.setName("Shashank");

		bill3.setMeterNo(12345);
		bill3.setAddress("Gzb");
		bill3.setName("Kshitij");

		System.out.println(bill1.toString());
		System.out.println(bill2.toString());
		System.out.println(bill3.toString());

		System.out.println(bill1.equals(bill2));
		System.out.println(bill1.equals(bill3));

		System.out.println(bill1.hashCode());
		System.out.println(bill2.hashCode());
		System.out.println(bill3.hashCode());

	}
}
