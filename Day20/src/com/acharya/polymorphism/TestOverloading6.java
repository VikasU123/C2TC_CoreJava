package com.acharya.polymorphism;

public class TestOverloading6 {
	int id;
	String name;
	int age;
	TestOverloading6(int i,String n){
		id=i;
		name=n;
	}
	TestOverloading6(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	void display() {
		System.out.println(id+" "+name+" "+age);
	}

	public static void main(String[] args) {
		TestOverloading6 s1=new TestOverloading6(111,"Vikas");
		TestOverloading6 s2=new TestOverloading6(222,"Sanjay",25);
		s1.display();
		s2.display();

	}

}
/*Output:
111 Vikas 0
222 Sanjay 25
*/