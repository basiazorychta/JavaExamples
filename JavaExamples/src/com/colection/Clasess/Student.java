package com.colection.Clasess;

class Student {

	private String name;
	private int id;
	private int age;
	private String address;
	
	Student(String _name, int _id, int _age, String _address ) {
		
		name = _name;
		id = _id;
		age = _age;
		address = _address;	
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String speak () {
		String intro = "Hello everyone, My name is: " + name +
		" I am a student with id : "  + id + ", who is " 
		+ age + " years old" + " and lives in " + address;
		return intro;
	}
	
	int calculateYearsToRetirement () {
		int yearsLeft = 65 - age;
		
		return yearsLeft;
	}
}




