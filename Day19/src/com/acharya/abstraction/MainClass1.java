//Abstract class having abstract method
package com.acharya.abstraction;

abstract class Bike{
	abstract void run();
}
class Honda extends Bike{
	void run() {
		System.out.println("running safely");
	}
}
public class MainClass1 {

	public static void main(String[] args) {
		Honda h = new Honda();
		h.run();

	}

}
//Output: running safely