//interface code snippet
package com.acharya.inteface;

interface Demo3 {
	public void method1();
}
public class Inf1 implements Demo3{
	public void method1() {
		System.out.println("method1");
	}
	
	public static void main(String[] args) {
		Inf1 obj = new Inf1();
		obj.method1();

	}

}
//Output: method1