package com.nt.sbeans;

public class Address {
private int houseno;
private String city;
private int pincode;

public Address(int houseno, String city, int pincode) {
	
	this.houseno = houseno;
	this.city = city;
	this.pincode = pincode;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#"+houseno +","+city+"-"+pincode;
	}
}
