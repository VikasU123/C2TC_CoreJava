//Abstract class having abstract method
package com.acharya.abstraction;
abstract class Bank{
	abstract int rateOfInterest();
}
class SBI extends Bank{
	int rateOfInterest() {
		return 7;
	}
}
class HDFC extends Bank{
	int rateOfInterest() {
		return 8;
	}
}
public class MainClass3 {

	public static void main(String[] args) {
		SBI s = new SBI();
		HDFC h = new HDFC();
		System.out.println("The rate of interest is SBI "+s.rateOfInterest());
		System.out.println("The rate of interest in HDFC "+h.rateOfInterest());

	}

}
/*Output:
The rate of interest is SBI 7
The rate of interest in HDFC 8
*/