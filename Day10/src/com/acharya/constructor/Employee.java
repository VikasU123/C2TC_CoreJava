package com.acharya.constructor;

public class Employee {
	int id;
	String name;
	float salary;
	//Constructor
	Employee(){
		System.out.println("User defined No-arg constructor is called");
	}
	//Method
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}

	public static void main(String[] args) {
	     Employee e1 = new Employee();
	     Employee e2 = new Employee();
	     e1.display();
	     e2.display();

	}

}
