package com.acharya.polymorphism;
class adder{
	static int add(int a, int b) {
		return a+b;
	}
	static double add(int a, int b) {
		return a+b;
	}
}
public class TestOverLoading3 {

	public static void main(String[] args) {
		System.out.println(Adder.add(11,11));

	}

}
//Output: Duplicate method add(int,int)in type adder