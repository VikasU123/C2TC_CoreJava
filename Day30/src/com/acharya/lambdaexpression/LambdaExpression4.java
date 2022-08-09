package com.acharya.lambdaexpression;

interface addition{
	public int add(int a,int b);
}
public class LambdaExpression4 {

	public static void main(String[] args) {
		addition d2 = (int a,int b)->(a+b);{
			System.out.println(d2.add(10,20));
		}

	}

}
//Output: 30
