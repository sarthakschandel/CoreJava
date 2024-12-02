package jodatimeapi;

import java.time.Year;

public class CheckLeapYear {

	public static void main(String args[]) {

		int n = Integer.parseInt(args[0]);//run as config then provide args :)
		Year y = Year.of(n);
		if (y.isLeap())
			System.out.printf("%d is Leap year", n);
		else
			System.out.printf("%d is not Leap year", n);

	}
}