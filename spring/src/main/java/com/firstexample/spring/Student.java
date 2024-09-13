package com.firstexample.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int sid;
	private String name;
	//Field injection
//	@Autowired
	private Address address;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	//Setter injection
	//@Autowired
	public void setAddress(Address address) {
		System.out.println("Done via setter Injection");
		this.address = address;
	}
	public Student(int sid, String name, Address address) {
		super();
		this.sid = sid;
		this.name = name;
		this.address = address;
	}
	//Constructor injection
	@Autowired
	public Student(Address address)
	{
		System.out.println("Constructor injection");
		this.address=address;
	}
	public Student()
	{
		
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", address=" + address + "]";
	}
	

}
