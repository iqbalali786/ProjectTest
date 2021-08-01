package com.gitproject;

public class Employ implements Cloneable {

	private Integer empId;
	private String empName;
	private String empCity;
	private Address add;

	public Employ(Integer empId, String empName, String empCity, Address add) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employ [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + ", add=" + add + "]";
	}

	@Override
	protected Employ clone() throws CloneNotSupportedException {

		Employ e1 = (Employ) super.clone();
		Address a1 = add.clone();
		e1.setAdd(a1);
		return e1;

	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;

	}

}
