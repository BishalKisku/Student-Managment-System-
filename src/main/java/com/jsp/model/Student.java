package com.jsp.model;

public class Student {
	private int id;
	private String name;
	private String Email;
	private String password;
	private String dob;
	private String gender;
	private String address;
	private long mob;
	private String relationshipstatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	public String getRelationshipstatus() {
		return relationshipstatus;
	}
	public void setRelationshipstatus(String relationshipstatus) {
		this.relationshipstatus = relationshipstatus;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Email=" + Email + ", password=" + password + ", dob=" + dob
				+ ", gender=" + gender + ", address=" + address + ", mob=" + mob + ", relationshipstatus="
				+ relationshipstatus + "]";
	}
}

