package com.gitproject;

import java.io.Serializable;

public class Students implements Serializable {
	
	private int rollNumber;
	private String name;
	private String sex;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Students [rollNumber=" + rollNumber + ", name=" + name + ", sex=" + sex + "]";
	}
	public Students(int rollNumber, String name, String sex) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.sex = sex;
	}
	
	

}
