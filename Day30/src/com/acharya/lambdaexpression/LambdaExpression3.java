//Lambda Expression (Parameter)
package com.acharya.lambdaexpression;

interface Drawable{
	public void draw(int radius);
}
public class LambdaExpression3 {

	public static void main(String[] args) {
		Drawable d2 = (int radius)->{
			System.out.println("Draw a circule with radius of "+radius);
		};
		d2.draw(10);

	}

}
//Output: Draw a circule with radius of 10