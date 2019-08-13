package com.university.classes;

public class Employe extends Person {
	
	private String occupation;
	private double salary;
	
	public Employe (String fname, String lname, String id, String email, String pnumber, 
			String address, String deptname, char g, String occupation, double salary){
		
		super (fname, lname, id, email, pnumber, address, deptname, g);
		this.occupation = occupation;
		this.salary = salary;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	 public String displayInfo () {
		String eintro = super.displayInfo() + "\nOccupation: " + occupation 
						+ "\nMonthly salary: " + salary;
		return eintro;
	}
}
