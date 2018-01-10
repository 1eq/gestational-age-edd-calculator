package com.getbabyscripts.ga;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class GestationalAgeUtils {
	public static Long getGestationalAgeDays(LocalDate edd, LocalDate now) {
		long days = ChronoUnit.DAYS.between(now, edd);

		if(now.isAfter(edd)) {
			return 280+Math.abs(days);
		} else {
			return 280-days-1;
		}
	}

	public static Long getGestationalAgeDays(LocalDate edd) {
		return getGestationalAgeDays(edd, LocalDate.now());
	}

	public static Long getGestationalAgeWeeks(LocalDate edd, LocalDate now) {
		long weeks = ChronoUnit.WEEKS.between(now, edd);

		if(weeks < 0) {
			return Math.abs(weeks);
		} else {
			weeks += 1;
			return 40-weeks;
		}
	}

	public static Long getGestationalAgeWeeks(LocalDate edd) {
		return getGestationalAgeWeeks(edd, LocalDate.now());
	}
}