package core.java.cloning;

public class Employee implements Cloneable {
	private String employeeFirstName;
	private String employeeLastName;
	private String employeeId;
	private Address address; // Declaration of Object of an Class is Association

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public Object clone() throws CloneNotSupportedException {
		Employee em = (Employee) super.clone();
		return em;
	}
}
