package interfaces;

public class Honda implements Car {

	@Override
	public void go() {
		System.out.println("Inside Hondas Go");

	}

	@Override
	public void stop() {
		System.out.println("Inside Hondas Stop");
	}

	public static void main(String[] args) {
		Honda h = new Honda();
		h.go();
		h.stop();
		Car.petrol();
	}
}
