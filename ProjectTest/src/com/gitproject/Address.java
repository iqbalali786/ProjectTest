package com.gitproject;

public class Address  implements Cloneable{

	private Integer zipcode;
	private String lane;

	public Integer getZipcode() {
		return zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	public String getLane() {
		return lane;
	}

	public void setLane(String lane) {
		this.lane = lane;
	}

	public Address(Integer zipcode, String lane) {
		super();
		this.zipcode = zipcode;
		this.lane = lane;
	}

	@Override
	public String toString() {
		return "Address [zipcode=" + zipcode + ", lane=" + lane + "]";
	}

	@Override
	protected Address clone() throws CloneNotSupportedException {
		
		return (Address) super.clone();
	}

}
