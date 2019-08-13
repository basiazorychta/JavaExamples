package com.university.main;

import java.util.ArrayList;

import com.university.classes.Department;
import com.university.classes.Employe;
import com.university.classes.Person;
import com.university.classes.Student;
import com.university.classes.University;

public class Engine {
	
	public static void PrintInfo (ArrayList<Student> arrayList) {
		
	
		for (Student stu : arrayList) {

			System.out.println("\n" + stu.displayInfo());
		}
	}
	
	public static void PrintInfoEmploye (ArrayList <Employe> arrayList) {
		
		for (Employe employe : arrayList) {

			System.out.println("\n" + employe.displayInfo());
		}
	}

	public static void main(String[] args) {

		Student s1 = new Student("Anna", "White", "RH7867", "anna.white@kth.se", "0789878678", "Upsala", "IT", 'f',
				"Soft Development", true, 4.0);

		Student s2 = new Student("Åsa", "Svenson", "RH7869", "asa.svenson@kth.se", "0700768798", "Stockholm", "IT", 'f',
				"Soft Development", true, 3.70);

		Student s3 = new Student("Peter", "Svenson", "RH7687", "peter.svenson@kth.se", "0700898970", "Kista",
				"Mechanic", 'm', "Robotic", false, 3.0);

		Student s4 = new Student("Mikael", "Stad", "RH7256", "mikael.stad@kth.se", "0703564566", "Stockholm", "IT", 'm',
				"Administrator", true, 2.70);

		Student s5 = new Student("Barbara", "Zorychta", "RH7865", "barbara.zorychta@kth.se", "0700342355", "Årsta",
				"Marketing", 'f', "Social media", true, 4.0);

		Employe e1 = new Employe("Peter", "Tom", "EM35111", "peter.tom@kth.se", "0700800544", "Solna", "Administration",
				'm', "CEO", 90000);

		Employe e2 = new Employe("Peter", "Gustavson", "EM35678", "peter.gustavson@kth.se", "07008000670", "Kista",
				"Marketing", 'm', "PR", 50000);

		Employe e3 = new Employe("Greta", "Karlson", "EM33271", "greta.karlson@kth.se", "0706887622", "Stockholm",
				"Administration", 'f', "Office Coordinator", 35000);

		Employe e4 = new Employe("Åsa", "Lax", "EM35214", "asa.lax@kth.se", "0723454344", "Bredeng", "IT", 'f',
				"Software Administrator", 55000);

		Employe e5 = new Employe("Anna", "Årsta", "EM32332", "anna.arsta@kth.se", "0707665544", "Stockholm", "IT", 'f',
				"Programist", 55000);

		Employe e6 = new Employe("Stina", "Hamn", "EM32112", "stina.hamn@kth.se", "0707110049", "Stockholm",
				"Administartion", 'f', "Cleaner", 25000);

		/*System.out.println(s1.displayInfo());
		System.out.println("\n");
		System.out.println(e1.displayInfo());
		*/

		Department itdept = new Department("IT", "Kista", "0700878788", "it@kth.se");

		itdept.addStudent(s1);
		itdept.addStudent(s2);
		itdept.addStudent(s4);
		itdept.addEmploye(e4);
		itdept.addEmploye(e5);
		
		/*System.out.println(itdept.isInternationalStudent("RH7867"));
		System.out.println(itdept.isInternationalStudent("RH7869"));
		System.out.println(itdept.isInternationalStudent("RH76869"));
		
		System.out.println("\n International Student in IT Dept: " + itdept.getCountOfInternationalStudents());
		
		System.out.println("\nIT Dept has : " + itdept.getStudentCountByGender('m') + " Student male");
		System.out.println("IT Dept has : " + itdept.getStudentCountByGender('f') + " Student female");
		
		System.out.println("\nIT Dept has : " + itdept.getEmployeCountByGender('m') + " Employe male");
		System.out.println("IT Dept has : " + itdept.getEmployeCountByGender('f') + " Employe female");
	*/
		
		
		
		Department marketingdept = new Department("Marketing", "Stockholm", "0700878766", "marketing@kth.se");

		marketingdept.addStudent(s5);
		marketingdept.addEmploye(e2);

		Department administrationdept = new Department("Administration", "Stockholm", "0700878700", "admin@kth.se");

		administrationdept.addEmploye(e1);
		administrationdept.addEmploye(e3);
		administrationdept.addEmploye(e6);

		Department mechanicdept = new Department("Mechanic", "Kista", "0700878711", "mechanic@kth.se");

		mechanicdept.addStudent(s3);

		/*
		// System.out.println("\n" + itdept.displayinfo());

		System.out.println("\n Employess ");

		ArrayList<Employe> list = itdept.getEmployes();

		for (Employe employe : list) {

			System.out.println("\n" + employe.displayInfo());
		}

		System.out.println("\n Students ");

		ArrayList<Student> slist = itdept.getStudents();

		for (Student stu : slist) {

			System.out.println("\n" + stu.displayInfo());
		}

		String id = "RH7867";
		Student temp = itdept.findStudent(id);

		System.out.println("\n \n ...... find: ");

		if (temp != null) {
			// System.out.println( temp.displayInfo());
			temp.setFirstName("Chuna");
			temp.setLastName("Black");
			itdept.updateStudent(temp);

		} else {
			System.out.println("Student : " + id + " does not find");
		}

		slist = itdept.getStudents();

		for (Student stu : slist) {

			System.out.println("\n" + stu.displayInfo());
		}
		
		String ide = "EM35214";
		Employe temp2 = itdept.findEmploye(ide);

		System.out.println("\n \n ...... find: ");

		if (temp2 != null) {
			// System.out.println( temp.displayInfo());
			temp2.setFirstName("JIMMY");
			temp2.setLastName("CHOO");
			temp2.setGender('m');
			temp2.setEmail("jimmy.choo@kth.se");
			itdept.updateEmploye(temp2);

		} else {
			System.out.println("Employe : " + ide + " does not find");
		}

		list = itdept.getEmployes();

		for (Employe employe : list) {

			System.out.println("\n" + employe.displayInfo() + "\n");
		}
		
		
		
		ArrayList<Person> personlist = new ArrayList<Person>();
		personlist.add(s1);
		personlist.add(e1);
		personlist.add(s2);
		personlist.add(e2);
		
		
		System.out.println("\n \n ...... Person .......\n \n ");

		for (Person person : personlist) {
			
			System.out.println(person.displayInfo() + "\n");
			
		}
	
		
		String id3 = "RH7867";
		Student temp3 = itdept.findStudent(id3);

		System.out.println("\n \n ...... VVVVVVV: ");

		if (temp3 != null) {
	
			itdept.removeStudent(temp3);
		

		} else {
			System.out.println("Student : " + id3 + " does not find");
		}

		slist = itdept.getStudents();

		for (Student stu : slist) {

			System.out.println("\n" + stu.displayInfo());
			
		}
		
		Student s6 = new Student("CLARA", "FLORA", "RH7007", "clara.flora@kth.se", "0700303030", "ALBY", "IT", 'f',
				"Soft Development", true, 3.0);
		
		itdept.addStudent(s6);
		
		System.out.println("\n Students after adding new one ");

		

		for (Student stu : slist) {

			System.out.println("\n" + stu.displayInfo());
		}
		
		System.out.println("\n --------------EMPLOYE");
		
		String id4 = "EM35214";
		Employe temp4 = itdept.findEmploye(id4);

		System.out.println("\n \n ...... VVVVVVV: ");

		if (temp4 != null) {
	
			itdept.removeEmploye(temp4);
		

		} else {
			System.out.println("Employe : " + id4 + " does not find");
		}

		list = itdept.getEmployes();

		for (Employe employe : list) {

			System.out.println("\n" + employe.displayInfo() + "\n");
		}
			
	
		Employe e7 = new Employe("Katia", "GUSTAVSON", "EM32300", "katia.gustavson@kth.se", "0707665544", "Stockholm", "IT", 'f',
				"Programist", 55000);
		
		itdept.addEmploye(e7);;
		
		System.out.println("\n EMPLOYES after adding new one ");

		for (Employe employe : list) {

			System.out.println("\n" + employe.displayInfo());
		}
		
		String id5 = "RH7007";
		Student temp5 = itdept.findStudent(id5);

		System.out.println("\n \n ...... VVVVVVV//STUDENT ID DEL .......: ");

		if (temp5 != null) {
	
			itdept.removeStudent(id5);;
		

		} else {
			System.out.println("Student : " + id3 + " does not find");
		}

		slist = itdept.getStudents();

		for (Student stu : slist) {

			System.out.println("\n" + stu.displayInfo());
			
		}
		
		Student s7 = new Student("CLARA", "FLORA", "RH7007", "clara.flora@kth.se", "0700303030", "ALBY", "IT", 'f',
				"Soft Development", true, 3.0);
		
		itdept.addStudent(s7);
		
		System.out.println("\n Students after adding again new one ");

		

		for (Student stu : slist) {

			System.out.println("\n" + stu.displayInfo());
		}
		*/
		
		University kth = new University ("KTH University", "Kungsträgården, Stockholm", 
				"0700101010", "kth@kth.se", "kth9999");
		
		System.out.println("\n" + kth.displayinfo());
		
		kth.addDeptartment(itdept);
		kth.addDeptartment(marketingdept);
		kth.addDeptartment(administrationdept);
		kth.addDeptartment(mechanicdept);
		
		Department chemistry = new Department("Chemistry", "Stockholm", "0700202020", "chemistry@kth.se");
		
		Student s9 = new Student("Roman", "Red", "RH7111", "romn.red@kth.se", "0700303031", "Stuvsta", "Chemistry", 'm',
				"Chemist", true, 3.7);
		
		Employe e8 = new Employe("Maria", "GUSTAVSON", "EM32311", "maria.gustavson@kth.se", "0707665540", "Stockholm", "Chemistry", 'f',
				"Teacher", 65000);
		chemistry.addStudent(s9);
		chemistry.addEmploye(e8);
		
		kth.addDeptartment(chemistry);
		
		System.out.println("\nKTH created new Dept: Chemistry\n " + chemistry.displayinfo() 
		+ "\n\nwith new Students: \n" + s9.displayInfo() + "\n\nand new Employes: \n" + e8.displayInfo());

		PrintInfo (chemistry.getStudents());
		
		Student s10 = new Student("Peter", "Parker", "RH7222", "romn.red@kth.se", "0700303011", "Stuvsta", "Chemistry", 'm',
				"Chemist", true, 4.0);
		
		boolean success = kth.addStudentInDepartment("Chemistry", s10);
		if (success ) {
			System.out.println("\nAdded");
		}
		else {
			System.out.println("\nDept does not exist");
		}
		PrintInfo (chemistry.getStudents());
		
		Employe e9 = new Employe("Marta", "SVENSON", "EM32381", "marta.svenson@kth.se", "0707665555", "Stockholm", "Chemistry", 'f',
				"Teacher", 65000);
		
		boolean added = kth.addEmployeInDepartment("Chemistry", e9);
		
		if (added) {
			System.out.println("\nAdded");
		}
		else {
			System.out.println("\nDept does not exist");
		}
		PrintInfoEmploye (chemistry.getEmployes());
		
		boolean removed = kth.removeStudentFromDepartment("Chemistry", "RH7222");
		if (removed) {
			System.out.println("\nRemoved. Left:");
		}
		else {
			System.out.println("\nDept does not exist. Did not remove");
		}
		PrintInfo (chemistry.getStudents());
		
		System.out.println("\nInternational Students : " + kth.getCompleteCountOfInternationalStudents());
		
		Student s11 = new Student("Peter", "Parker", "RH7222", "romn.red@kth.se", "0700303011", "Stuvsta", "Chemistry", 'm',
				"Chemist", true, 4.0);
		
		boolean done = kth.addStudentInDepartment("Chemistry", s10);
		if (done ) {
			System.out.println("\nAdded");
		}
		else {
			System.out.println("\nDept does not exist");
		}
		PrintInfo (chemistry.getStudents());
		
		System.out.println("\nInternational Students : " + kth.getCompleteCountOfInternationalStudents());
		
		System.out.println("\nEmploye - Male : " + kth.getCompleteCountOfEmployeGender('m'));
		System.out.println("Employe - Female : " + kth.getCompleteCountOfEmployeGender('f'));
		System.out.println("\nStudent - Male : " + kth.getCompleteCountOfStudentGender('m'));
		System.out.println("Student - Female : " + kth.getCompleteCountOfStudentGender('f'));
		
		System.out.println("\nStudents in chemistry dept: " + chemistry.getStudentSize());
		System.out.println("Students in university: " + kth.getCompleteCountOfStudents());
		
		System.out.println("\nEmployes in IT dept: " + itdept.getEmployeSize());
		System.out.println("Employes in university: " + kth.getCompleteCountOfEmployes());
		
		
	}
	

}
