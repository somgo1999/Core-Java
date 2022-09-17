package core.java.cloning;

public class DeepEmployee implements Cloneable {
	private String name;
	private int phoneNo;
	private String id;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
	public Object clone() throws CloneNotSupportedException{
		DeepEmployee dpee = (DeepEmployee) super.clone();
		return dpee;
	}
}
