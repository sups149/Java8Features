package test.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeTest {
	public static void main(String[] args) {
		LocalDate curDate = LocalDate.now();
		System.out.println(curDate);
		
		LocalDate specificDate = LocalDate.of(1990, 05, 19);
		System.out.println(specificDate);
		
		LocalTime locTime = LocalTime.now();
		System.out.println(locTime);
		
		LocalTime specificTime = LocalTime.of(14, 50, 47);
		System.out.println(specificTime);
		
		LocalDateTime curDateTime = LocalDateTime.now();
		System.out.println(curDateTime);
		
		LocalDateTime specificDateTime = LocalDateTime.of(specificDate, specificTime);
		System.out.println(specificDateTime);
	}
}
