package com.acharya.thiskeyword;

public class Student2 {
	int rollno;
	String name;
	float fees;
	public Student2(int r, String n,float f) {
		rollno=r;
		name=n;
		fees=f;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+fees);
	}

	public static void main(String[] args) {
		Student2 s1 = new Student2(101,"Sanjay",5000f);
		Student2 s2 = new Student2 (102,"Vikas",5000f);
		s1.display();
		s2.display();

	}

}
