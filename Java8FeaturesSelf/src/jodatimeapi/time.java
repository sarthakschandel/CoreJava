package jodatimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;

public class time {
	public static void main(String[] args) {

		// LocalDate object can be used to get the date, day month, year
		LocalDate date = LocalDate.now();
		System.out.println(date);
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		System.out.println(dd + "..." + mm + "..." + yy);
		System.out.println();// for segregation in output

		// LocalTime object can be used to get the h, min, sec, nanosec etc
		LocalTime time = LocalTime.now();
		System.out.println(time);
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		System.out.println(h + " " + m + " " + s + " " + n);
		System.out.println();

		// If we want to represent both Date and Time then we should go for
		// LocalDateTime object.
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		System.out.println();

		// ZoneId object can be used to represent Zone.
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		System.out.println();

		// Period object can be used to represent quantity of time
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1989, 06, 15);
		Period p = Period.between(birthday, today);
		System.out.printf("age is %d year %d months %d days", p.getYears(), p.getMonths(), p.getDays());// can use
																										// normal
																										// println too
		System.out.println();
		
	}
}