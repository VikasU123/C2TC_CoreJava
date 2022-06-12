//Passed as arguments in the method cell
package com.acharya.constructor;

public class S1 {
	void m(S1 a) {
		System.out.println("method is invoked");
	}
	void p() {
		m(this);
	}
class Main{
	public static void main(String[] args) {
		S1 s1 = new S1();
		s1.p();

	}

}
}
