//Abstract class having abstract constructor
package com.acharya.abstraction;
abstract class Bike2{
	Bike2(){
		System.out.println("bike is created");
	}
	abstract void run();
	void changeGear() {
		System.out.println("gear changed");
	}
}
class Honda2 extends Bike2{
	void run() {
		System.out.println("running safely");
	}
}
public class MainClass4 {

	public static void main(String[] args) {
		Honda2 h = new Honda2();
		h.run();
		h.changeGear();
	}

}
/*Output:
bike is created
running safely
gear changed
*/