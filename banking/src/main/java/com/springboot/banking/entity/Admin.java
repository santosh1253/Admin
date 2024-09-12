package com.springboot.banking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {
	@Id
	private int adminId;
	@Column(nullable=false)
	private String uname;
	@Column(nullable=false)
	private String password;
	public int getId() {
		return adminId;
	}
	public void setId(int id) {
		adminId = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin(int id, String uname, String password) {
		super();
		adminId= id;
		this.uname = uname;
		this.password = password;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", uname=" + uname + ", password=" + password + "]";
	}
	

}
