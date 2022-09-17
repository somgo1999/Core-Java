package core.java.cloning;

public class DeepAddress implements Cloneable {
	private String landmark;
	private String district;
	private int pinCode;

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDistrict() {
		return district;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public int getPinCode() {
		return pinCode;
	}

//Understand Doubt
	public Object clone() throws CloneNotSupportedException {
		DeepAddress dpas = (DeepAddress) super.clone();
		return dpas;
	}
}
