package com.cg.clint;

import java.util.Scanner;

import com.cg.entity.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		StudentService service = new StudentServiceImpl();
		
		Student student = new Student();
		
		Scanner sc = new Scanner(System.in);
		
		// Create Operation
		  System.out.println("Enter the student ID");
		  student.setStudentId(sc.nextInt());
		  System.out.println("Enter the student name"); student.setName(sc.next());
		  service.addStudent(student);
		 
		 
		
		// Retrieve Operation
		System.out.println("Enter the student ID that you want to retrive");
		student = service.findStudentById(sc.nextInt());
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName());
		
		// Update Operation
		System.out.println("Enter the student ID you want to update");
		student = service.findStudentById(sc.nextInt());
		System.out.println("Enyer the name you want update");
		sc.nextLine();
		student.setName(sc.nextLine());
		service.updateStudent(student);
		
		//at this breakpoint, we have updated record added in first section
		System.out.println("Enter the ID");
		student = service.findStudentById(sc.nextInt());
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName()); 
		
		 //Delete Operation
		System.out.println("Enter the student ID you want to delect");
		student = service.findStudentById(sc.nextInt());
		service.removeStudent(student);
		System.out.println("End of program/Life cycle completed..."); 

	}

}
