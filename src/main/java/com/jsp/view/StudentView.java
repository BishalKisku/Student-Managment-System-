package com.jsp.view;

import java.util.Scanner;

import com.jsp.controller.StudentController;

import com.jsp.model.Student;

public class StudentView {
	static Scanner sc =new Scanner(System.in);
	static StudentController controller = new StudentController();
	
	private static Student getStudentObject() {
		System.out.println("enter student id");
		int id = sc.nextInt();
		System.out.println("enter student name");
		String name= sc.nextLine();
		sc.nextLine(); // Dummy Command
		System.out.println("enter student email");
		String email = sc.nextLine();
		System.out.println("enter student PASSWORD");
		String password = sc.nextLine();
		System.out.println("enter student dob");
		String dob = sc.nextLine();
		System.out.println("enter student address");
		String address = sc.nextLine();
		System.out.println("enter student gender");
		String gender= sc.nextLine();
		System.out.println("enter student mob");
		long mob = sc.nextLong();
		System.out.println("enter student relationshipstatus");
		String relationshipstatus = sc.nextLine();
		sc.nextLine(); // Dummy Command
		
		Student s= new Student();
		s.setId(id);
		s.setName(name);
	    s.setEmail(email);
	    s.setPassword(password);
	    s.setDob(dob);
	    s.setGender(gender);
	    s.setAddress(address);
	    s.setMob(mob);
	    s.setRelationshipstatus(relationshipstatus);
	    return s;
	}
	
	public static void main(String[] args) {
		System.out.println("WELCOME TO SMS APP");
		while(true) {
			System.out.println("ENTER YOUR CHOICE");
			System.out.println("1.save student ");
			System.out.println("2.find student by id ");
			System.out.println("3.update student by id ");
			System.out.println("4.delete student by id");
			System.out.println("5.find all");
			System.out.println("6.exit");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			
			case 1: // create student and save 
				
				Student s = getStudentObject();
				controller.saveStudent(s);
				
				break;
				
			case 2:
				System.out.println("Enter student id you want to find:");
				int stuId = sc.nextInt();
				controller.findStudentById(stuId);
				
				break;
			case 3:
				System.out.println("Enter student id");
				int stuId2=sc.nextInt();
				System.out.println("Enter new relationshipstatus status");
				sc.nextLine();
				String newRelationshipstatus = sc.nextLine();
				controller.updateStudentById(stuId2,newRelationshipstatus);
				
				
				
				break;
			case 4:
				System.out.println("Enter student id");
				int stuId3=sc.nextInt();
				controller.deleteStudentId(stuId3);
				
				break;
			case 5:
				controller.findAll();
				
				break;
			case 6:
				System.out.println("THANK YOU");
				return;
				

			default:
				System.out.println("INVALID");
				break;
			}
			
			
		}
		
		
	}

}
