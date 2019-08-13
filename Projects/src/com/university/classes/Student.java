package com.university.classes;

public class Student extends Person {
	
	private String program;
	private boolean isInternational;
	private double GPA;
	
	
	 public Student (String fname, String lname, String id, String email, String pnumber, 
			String address, String deptname, char g, String program, boolean isInternational, 
			double GPA){
		
		super (fname, lname, id, email, pnumber, address, deptname, g);
		this.program = program;
		this.isInternational = isInternational;
		this.GPA = GPA;
	}
	

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public boolean isInternational() {
		return isInternational;
	}

	public void setInternational(boolean isInternational) {
		this.isInternational = isInternational;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	@Override
	public String displayInfo () {
		String sintro = super.displayInfo() + "\nProgram Name: " + program + "\nIs International: "
						+ isInternational + "\nStudent GPA: " + GPA;
		return sintro;
	}
	
	

}
