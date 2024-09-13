package com.firstexample.spring;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String hno;
	private String location;
	private int pincode;
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", location=" + location + ", pincode=" + pincode + "]";
	}
	public Address(String hno, String location, int pincode) {
		super();
		this.hno = hno;
		this.location = location;
		this.pincode = pincode;
	}
	
	

}
