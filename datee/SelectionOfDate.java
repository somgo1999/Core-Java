package core.java.datee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SelectionOfDate {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String d = "15/08/2022";
		Date dd = format.parse(d);
		System.out.println(dd);

	}
}
