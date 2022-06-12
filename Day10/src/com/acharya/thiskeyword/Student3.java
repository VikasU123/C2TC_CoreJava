//To invoke current class constructor
package com.acharya.thiskeyword;

public class Student3 {
	Student3(){
		System.out.println("hello a");
	}
	Student3(int x){
		this();
		System.out.println(x);
	}

	public static void main(String[] args) {
		Student3 a = new Student3(10);

	}

}
