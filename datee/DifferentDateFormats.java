package core.java.datee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DifferentDateFormats {
	public static void main(String[] agrs) {
		Date today = new Date();
		System.out.println(today);
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy");
		String d = sdf.format(today);
		System.out.println(d);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yy");
		String d1 = sdf1.format(today);
		System.out.println(d1);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy/MM/dd");
		String d2 = sdf2.format(today);
		System.out.println(d2);
		
	}
}
