package core.java.collectionframework;

public class Marksheet implements Comparable<Marksheet>{
	private String rollno;
	private String fname;
	private String lname;
	private int phy;
	private int che;
	private int mat;

	public Marksheet() {
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getRollno() {
		return rollno;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFname() {
		return fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getLname() {
		return lname;
	}

	public void setPhy(int phy) {
		this.phy = phy;
	}

	public int getPhy() {
		return phy;
	}

	public void setChe(int che) {
		this.che = che;
	}

	public int getChe() {
		return che;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getMat() {
		return mat;
	}

	@Override
	public int compareTo(Marksheet m) {
		
		return rollno.compareTo(m.rollno);
	}

}
