package com.acharya.lambdaexpression;
interface Sayable2{
	public void say();
}

public class LambdaExpression2 {

	public static void main(String[] args) {
		Sayable2 s=()->{
			System.out.println("I have nothing to say");
			System.out.println("I have nothing to say");
			System.out.println("I have nothing to say");
		};
		s.say();

	}

}
/*Output: I have nothing to say
I have nothing to say
I have nothing to say*/
