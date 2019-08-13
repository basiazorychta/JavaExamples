package com.colection.Clasess;

public class Lynx extends Cat {
	
	private double sizeOfEar;
	
	
	
	public double getSizeOfEar() {
		return sizeOfEar;
	}



	public void setSizeOfEar(double sizeOfEar) {
		this.sizeOfEar = sizeOfEar;
	}



	public void growl () {
		System.out.println("Lynx name is: " + getPetName () + " , and is : " + getPetAge () + " years old. " + getPetName () + " say : Grrrrr...! Lynx size of ear is: " + sizeOfEar);
	}

}
