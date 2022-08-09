package com.acharya.lambdaexpression;

import java.util.ArrayList;

public class LambdaExpression5 {

	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("V");
		obj.add("i");
		obj.add("k");
		obj.add("a");
		obj.add("s");
		obj.forEach(temp -> System.out.print(temp));

	}

}
//Output: Vikas