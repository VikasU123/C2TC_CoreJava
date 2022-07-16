package com.acharya.polymorphism;

public class TestOverloading4 {
	void run() {
		System.out.println("Vehicle is running");
	}
}
	class Bike2 extends TestOverloading4{
		void run() {
			System.out.println("bike is running safely");
		}

	public static void main(String[] args) {
		Bike2 obj = new Bike2();
		obj.run();

	}

}
