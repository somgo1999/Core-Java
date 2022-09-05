package core.java.datee;

import java.util.Calendar;
import java.util.Date;

public class Trillion {
	public static void main(String[] agrs) {
		long r = 1000000000000l;
		Date d = new Date(r);
		System.out.println(d);
// MilliSeconds calculated from 1970 January 1
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		System.out.println(cal);
		
	}
}
