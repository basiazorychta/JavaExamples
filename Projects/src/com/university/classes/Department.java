package com.university.classes;

import java.util.ArrayList;

public class Department {

	private String deptName;
	private String address;
	private String phoneNumber;
	private String email;

	ArrayList<Student> students;
	ArrayList<Employe> employes;

	public Department(String deptName, String address, String phoneNumber, String email) {

		this.deptName = deptName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;

		students = new ArrayList<>();
		employes = new ArrayList<>();
	}

	public void addStudent(Student object) {

		students.add(object);
	}

	public Student findStudent(String id) {

		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == id) {
				return students.get(i);
			}
		}
		return null;
	}
	
	/**
	 * This function checks if student is international or not.
	 * if student is international then it will return 1 otherwise 0
	 * and if student does not exist in the system, it will return -1
	 * */
	public int isInternationalStudent (String id) {
		for (int i = 0; i < students.size(); i++) {
			
			if (students.get(i).getId() == id)
				if(students.get(i).isInternational()) {
					return 1;
				}
				else {
					return 0;
			}
		}
		
		return -1;
	}
	
	public int getCountOfInternationalStudents () {
		int count = 0;
		
		for (Student student : students) {
			
			int answer = isInternationalStudent (student.getId());
			if (answer == 1) {
				count++;
			}
		}
		
		return count;
	}
	
	public int getStudentCountByGender (char gender) {
		
		int count = 0;
		
		for (Student student : students) {
			if (student.getGender() == gender) {
				count++;  
			}
		}
		
		return count;
	}

	public void updateStudent(Student object) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == object.getId()) {
				students.set(i, object);
				break;
			}
		}

	}
	
	public void removeStudent (Student object) {
		
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == object.getId()) {
				
				students.remove(object);
				break;
			}
		}
	}
	
	public void removeStudent (String id) {
		for (int i = 0; i < students.size(); i++) {
			if ( students.get(i).getId() == id) {
				students.remove(i);
				break;
			}
		}
	}

	public void addEmploye(Employe object) {

		employes.add(object);
	}

	public Employe findEmploye(String id) {

		for (int i = 0; i < employes.size(); i++) {
			if (employes.get(i).getId() == id) {
				return employes.get(i);
			}
		}
		return null;
	}

	public void updateEmploye(Employe object) {
		for (int i = 0; i < employes.size(); i++) {
			if (employes.get(i).getId() == object.getId()) {
				employes.set(i, object);
				break;
			}
		}

	}
	
	public void removeEmploye (Employe object) {
		for (int i = 0; i < employes.size(); i++) {
			if ( employes.get(i).getId() == object.getId()) {
				employes.remove(object);
				break;
			}
		}
	}
	
	public int getEmployeCountByGender (char gender) {
		
		int count = 0;
		
		for (Employe employe : employes) {
			
			if (employe.getGender() == gender) {
				count++;  
			}
		}
		
		return count;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public ArrayList<Employe> getEmployes() {
		return employes;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String displayinfo() {
		String info = "University Department Name: " + deptName + "\nAddress: " + address + "\nPhone Number: "
				+ phoneNumber + "\nEmail: " + email;
		return info;
	}
	
	public int getStudentSize () {
		return students.size();
	}
	public int getEmployeSize () {
		return employes.size();
	}

}
