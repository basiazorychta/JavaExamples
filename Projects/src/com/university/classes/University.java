package com.university.classes;

import java.util.ArrayList;

public class University {
	
	private String universityName;
	private String mainAddress;
	private String mainPhoneNumber;
	private String mainEmail;
	private String universityCode;
	
	ArrayList <Department> departments;
	
	public University (String universityName, String mainAddress, 
			String mainPhoneNumber, String mainEmail, String universityCode) {
		
		this.universityName = universityName;
		this.mainAddress = mainAddress;
		this.mainPhoneNumber = mainPhoneNumber;
		this.mainEmail = mainEmail;
		this.universityCode = universityCode;
		
		departments = new ArrayList <>();
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getMainAddress() {
		return mainAddress;
	}

	public void setMainAddress(String mainAddress) {
		this.mainAddress = mainAddress;
	}

	public String getMainPhoneNumber() {
		return mainPhoneNumber;
	}

	public void setMainPhoneNumber(String mainPhoneNumber) {
		this.mainPhoneNumber = mainPhoneNumber;
	}

	public String getMainEmail() {
		return mainEmail;
	}

	public void setMainEmail(String mainEmail) {
		this.mainEmail = mainEmail;
	}

	public String getUniversityCode() {
		return universityCode;
	}

	public void setUniversityCode(String universityCode) {
		this.universityCode = universityCode;
	}

	public ArrayList<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(ArrayList<Department> departments) {
		this.departments = departments;
	}
	
	public String displayinfo() {
		
		String info = "University Name: " + universityName + "\nMain Address: " + mainAddress + "\nMain Phone Number: "
				+ mainPhoneNumber + "\nMain Email: " + mainEmail + "\nUniversity Spec. Code: " + universityCode;
		return info;
	}
	
	public void addDeptartment (Department object) {
		departments.add (object);
	}
	
	public boolean addStudentInDepartment (String deptName, Student object) {
		
		for (Department department : departments) {
			//System.out.println(department.getDeptName());
		
			if (department.getDeptName().equalsIgnoreCase(deptName)) {
			department.addStudent(object);
				return true;
			}
			
		}
		return false;
		
	}
	public boolean addEmployeInDepartment (String deptName, Employe object) {
		for (Department department : departments) {
			if (department.getDeptName().equalsIgnoreCase(deptName)) {
				department.addEmploye(object);
				return true;
			}
			
		}
		return false;
	}
	
	public boolean removeStudentFromDepartment (String deptName, String id) {
		
		for (Department department : departments) {
			//System.out.println(department.getDeptName());
		
			if (department.getDeptName().equalsIgnoreCase(deptName)) {
			department.removeStudent(id);
				return true;
			}
			
		}
		return false;
	}
		
		public int getCompleteCountOfInternationalStudents () {
			int count = 0;
			
			for (Department department : departments) {
				
				count += department.getCountOfInternationalStudents();
				
			}
			
			return count;
		
	}
		public int getCompleteCountOfEmployeGender (char gender) {
			
			int count = 0;
			for (Department department : departments) {
				count += department.getEmployeCountByGender(gender);
				
			}
			return count;
		}
		
		public int getCompleteCountOfStudentGender (char gender) {
			
			int count = 0;
			for (Department department : departments) {
				count += department.getStudentCountByGender(gender);
				
			}
			return count;
		}
		
		public int getCompleteCountOfStudents () {
			int count = 0;
			
			for (Department department : departments) {
				
				count += department.getStudentSize();
				
			}
			
			return count;
		
	}
		public int getCompleteCountOfEmployes () {
			int count = 0;
			
			for (Department department : departments) {
				
				count += department.getEmployeSize();
				
			}
			
			return count;
		
	}
		

}
