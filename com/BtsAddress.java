package com;

public class BtsAddress {

	String citizen;
	int pincode;
	String location;
	int phonenumber;
	
	public String getCitizen() {
		return citizen;
	}
	public void setCitizen(String citizen) {
		this.citizen = citizen;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public BtsAddress(String citizen, int pincode, String location, int phonenumber) {
		super();
		this.citizen = citizen;
		this.pincode = pincode;
		this.location = location;
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "BtsAddress [citizen=" + citizen + ", pincode=" + pincode + ", location=" + location + ", phonenumber="
				+ phonenumber + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
