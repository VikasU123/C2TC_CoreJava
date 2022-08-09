//Lambda Expression (No parameter)
package com.acharya.lambdaexpression;
interface Sayable{
	public void say();
}

public class LambdaExpression {
	public static void main(String[] args) {
		Sayable s = ()->{System.out.println("I have nothing to say");};
		s.say();
	}

}
/*Output: I have nothing to say*/