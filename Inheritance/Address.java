package Inheritance;

public class Address {

	int pincode;
	String landmark;
	int phonenumber;

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", landmark=" + landmark + ", phonenumber=" + phonenumber + "]";
	}

	public Address(int pincode, String landmark, int phonenumber) {
		super();
		this.pincode = pincode;
		this.landmark = landmark;
		this.phonenumber = phonenumber;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
