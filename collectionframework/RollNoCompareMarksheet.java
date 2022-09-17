package core.java.collectionframework;

import java.util.*;

public class RollNoCompareMarksheet {
	public static void main(String[] args) {

		Marksheet m1 = new Marksheet();
		m1.setRollno("1");
		m1.setFname("Ram");
		m1.setLname("Sharma");
		m1.setPhy(80);
		m1.setChe(70);
		m1.setMat(80);
		Marksheet m2 = new Marksheet();
		m2.setRollno("5");
		m2.setFname("Vijay");
		m2.setLname("Gupta");
		m2.setPhy(80);
		m2.setChe(70);
		m2.setMat(80);
		Marksheet m3 = new Marksheet();
		m3.setRollno("4");
		m3.setFname("Suresh");
		m3.setLname("Patel");
		m3.setPhy(80);
		m3.setChe(70);
		m3.setMat(80);
		Marksheet m4 = new Marksheet();
		m4.setRollno("3");
		m4.setFname("Ramesh");
		m4.setLname("Verma");
		m4.setPhy(80);
		m4.setChe(70);
		m4.setMat(80);
		Marksheet m5 = new Marksheet();
		m5.setRollno("2");
		m5.setFname("Shyam");
		m5.setLname("Jain");
		m5.setPhy(86);
		m5.setChe(77);
		m5.setMat(80);
		ArrayList list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);

		Iterator i = list.iterator();
		while (i.hasNext()) {
			Marksheet m = (Marksheet) i.next();
			System.out.println(m.getRollno() + " " + m.getFname() + " " + m.getLname() + " " + m.getPhy() + " "
					+ m.getChe() + " " + m.getMat());
		}
	}
}