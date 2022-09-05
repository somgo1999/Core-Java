package core.java.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) throws ParseException {

		Person p = new Person();

		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		//String s = "11/11/2011";

		//Date d = sdf.parse(s);

		p.setDob("11/11/2011");

		System.out.println(p.getDob());

	}

}
