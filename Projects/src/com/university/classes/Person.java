package com.university.classes;

public abstract class Person {

	private String firstName;
	private String lastName;
	private String id;
	private String email;
	private String phoneNumber;
	private String address;
	private String deptName;
	private char gender;

	Person(String fname, String lname, String id, String email, String pnumber, 
			String address, String deptname, char g) {

		this.firstName = fname;
		this.lastName = lname;
		this.id = id;
		this.email = email;
		this.phoneNumber = pnumber;
		this.address = address;
		this.deptName = deptname;
		this.gender = g;
		
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	
	public String displayInfo () {
		
		String info = "First Name: " + firstName + "\nLast Name: " + lastName 
					+ "\nId: " + id + "\nemail: " + email + "\nPhone Number: " 
					+ phoneNumber + "\nAddress: " + address + "\nDepartment Name: " + deptName
					+ "\nGender: " + gender;
					
		return info;
	}

}
