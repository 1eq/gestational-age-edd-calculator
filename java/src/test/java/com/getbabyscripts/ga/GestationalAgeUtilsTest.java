package com.getbabyscripts.ga;

import java.time.LocalDate;

public class GestationalAgeUtilsTest {

	public static void main(String args[]) {
		GestationalAgeUtilsTest test = new GestationalAgeUtilsTest();
		test.test1();
	}

	public void test1() {
		LocalDate edd = LocalDate.parse("2017-12-31");
		LocalDate cmp = LocalDate.parse("2017-12-31");
		long days = GestationalAgeUtils.getGestationalAgeDays(edd, cmp);
		long weeks = GestationalAgeUtils.getGestationalAgeWeeks(edd, cmp);

//		[
//    ["12/31/2017", "12/31/2017"],
//    ["12/31/2017", "1/1/2018"],
//    ["12/31/2017", "12/30/2017"],
//    ["12/31/2017", "7/24/2107"],
//    ["12/31/2017", "8/20/2017"],
//    ["3/21/2018", "1/5/2017"],
//    ["3/21/2018", "1/6/2017"],
//]
	}

}
