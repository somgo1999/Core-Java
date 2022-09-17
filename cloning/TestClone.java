package core.java.cloning;

public class TestClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address a = new Address();
		a.setStreet("MG Road");
		a.setCity("Indore");
		a.setState("Madhya Pradesh");
		Employee e = new Employee();
		e.setEmployeeFirstName("Ram");
		e.setEmployeeLastName("Sharma");
		e.setEmployeeId("E123");
		e.setAddress(a);
		System.out.println(e.getEmployeeFirstName());
		System.out.println(e.getEmployeeLastName());
		System.out.println(e.getEmployeeId());
		System.out.println(e.getAddress().getState());
		System.out.println(e.getAddress().getCity());
		System.out.println(e.getAddress().getStreet());

		Employee e1 = (Employee) e.clone();
		System.out.println(e1.getEmployeeFirstName());
		System.out.println(e1.getEmployeeLastName());
		System.out.println(e1.getEmployeeId());
		System.out.println(e1.getAddress().getState());
		System.out.println(e1.getAddress().getCity());
		System.out.println(e1.getAddress().getStreet());
	}
}
