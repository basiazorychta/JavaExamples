package com.colection.Clasess;

public class Person {
	
	private String name;
	private String surname;
	private String phoneNumber;
	private String address;
	private int id;
	private int age;
	private double weight;
	private double height;
	
	Person ( String _name, String _surname, String _phoneNumber, String _address, int _id,
			int _age, double _weight, double _height){
		
		name = _name;
		surname = _surname;
		phoneNumber = _phoneNumber;
		address = _address;
		id = _id;
		age = _age;
		weight = _weight;
		height = _height;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public String info () {
		String introduction = " Full data: " + name + ", "+ surname + " lives in : " + address
				+ ". Phone number: " + phoneNumber + ". " + "Person id: " + id + ". Age: " + 
				age + ". Weight : " + weight + ", and height : " + height;
		return introduction;
	}

}
