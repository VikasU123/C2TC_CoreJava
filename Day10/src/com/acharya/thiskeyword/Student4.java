//To invoke current class constructor(Contd..)
package com.acharya.thiskeyword;

public class Student4 {
	Student4(){
		this(5);
		System.out.println("hello a");
	}
	Student4(int x){
		System.out.println(x);
	}

	public static void main(String[] args) {
		Student4 a = new Student4();

	}

}
