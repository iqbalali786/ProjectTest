package com.gitproject;

public class Test {

	
	public static void main(String[] args) throws CloneNotSupportedException {

		Address adds = new Address(222201, "gaytrinagar");

		Employ original = new Employ(101, "iqbal", "pune", adds);

		Employ duplicate = original.clone();
		
		System.out.println(original);
		System.out.println(duplicate);
		
		duplicate.getAdd().setLane("belwar");
		
		System.out.println("duplicate " + duplicate);

		System.out.println("original " + original);		
		
	}
	
	
}
