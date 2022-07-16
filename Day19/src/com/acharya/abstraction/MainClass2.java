//Abstract class having abstract method
package com.acharya.abstraction;
abstract class shape{
	abstract void draw();
}
class rectangle extends shape{
	void draw() {
		System.out.println("drawing rectangle");
	}
}
class circle extends shape{
	void draw() {
		System.out.println("drawing circle");
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		shape s = new rectangle();
		s.draw();

	}

}
//Output: drawing rectangle