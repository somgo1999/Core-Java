package core.java.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private String name;
	private String address;
	private Date dob;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setDob(String dob) throws ParseException {
		this.dob = sdf.parse(dob);
	}

	public String getDob() {
		return sdf.format(dob);
	}
}
