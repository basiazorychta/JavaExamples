package com.colection.Clasess;

public class Cat {
	
	private String petName;
	private String petColor;
	private int petAge;
	
	
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetColor() {
		return petColor;
	}
	public void setPetColor(String petColor) {
		this.petColor = petColor;
	}
	public int getPetAge() {
		return petAge;
	}
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	
	public void speak () {
		System.out.println("My cat names is : " + petName + " and is : " + petColor + ". Cat is : " + petAge + " years old and says : \"Meow!\"");
		
	}

}
