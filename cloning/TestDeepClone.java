package core.java.cloning;

public class TestDeepClone {
	public static void main(String[] args) throws Exception {
		DeepEmployee de = new DeepEmployee();
		de.setName("Ram Sharma");
		de.setPhoneNo(1234567890);
		de.setId("DE1234");
		DeepAddress da = new DeepAddress();
		da.setLandmark("Choithram");
		da.setDistrict("Indore");
		da.setPinCode(452012);
		System.out.println(de.getName());
		System.out.println(de.getPhoneNo());
		System.out.println(de.getId());
		System.out.println(da.getLandmark());
		System.out.println(da.getDistrict());
		System.out.println(da.getPinCode());
		System.out.println("----------------------");
		DeepEmployee dec = (DeepEmployee) de.clone();
		System.out.println(dec.getName());
		System.out.println(dec.getPhoneNo());
		System.out.println(dec.getId());
		DeepAddress dac = (DeepAddress) da.clone();
		System.out.println(dac.getLandmark());
		System.out.println(dac.getDistrict());
		System.out.println(dac.getPinCode());

	}
}
