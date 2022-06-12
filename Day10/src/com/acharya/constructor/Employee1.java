package com.acharya.constructor;

public class Employee1 {
	int id;
	String name;
	float salary;
	//Constructor
	Employee1(){
		System.out.println("User defined No-arg constructor is called");
	}
	//User defined parameterized constructor
	public Employee1(int i,String n,float s) {
		id=i;
		name=n;
		salary=s;
	}
	//Method
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}

	public static void main(String[] args) {
	     Employee1 e1 = new Employee1(111,"Vikas",5000f);
	     Employee1 e2 = new Employee1(222,"Sanjay",5000f);
	     e1.display();
	     e2.display();

	}

}
