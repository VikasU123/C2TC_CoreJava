package com.acharya.thiskeyword;

public class Student1 {
	void display() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		System.out.println("The object reference of s1:"+s1);
		System.out.println("The object reference of s2:"+s2);
		s1.display();

	}

}
