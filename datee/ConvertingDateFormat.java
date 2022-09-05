package core.java.datee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertingDateFormat {
	public static void main(String[] agrs) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String s = sdf.format(today);
		System.out.println(s);
	}
}
