package com.acharya.thiskeyword;

public class Student {
	void display() {
		System.out.println(this);
		System.out.println("in display method");
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1);
		s1.display();

	}

}
