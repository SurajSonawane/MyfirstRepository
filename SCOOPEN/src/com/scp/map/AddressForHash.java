package com.scp.map;

import java.util.Comparator; 

public class AddressForHash implements Cloneable {
	private int pincode;
	private String city;
	private MyInfo my1;

	static Comparator<DemoHash> compBypin = new Comparator<DemoHash>() {

		@Override
		public int compare(DemoHash p1, DemoHash p2) {
			
			return p1.getAdd().pincode - p2.getAdd().pincode;
		}

	};

	@Override
	public String toString() {
		return "\n AddressForHash [pincode=" + pincode + ", city=" + city + ", my1=" + my1 + "]";
	}

	public AddressForHash(int pincode, String city, MyInfo my1) {
		super();
		this.pincode = pincode;
		this.city = city;
		this.my1 = my1;
	}

	

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public MyInfo getMy1() {
		return my1;
	}

	public void setMy1(MyInfo my1) {
		this.my1 = my1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pincode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressForHash other = (AddressForHash) obj;
		if (pincode != other.pincode)
			return false;
		return true;
	}

	protected AddressForHash clone() throws CloneNotSupportedException {
		AddressForHash clonAdd1 = (AddressForHash) super.clone();
		MyInfo clonMy = clonAdd1.getMy1().clone();
		clonAdd1.setMy1(clonMy);
		return (clonAdd1); //super.clone();

	}
}