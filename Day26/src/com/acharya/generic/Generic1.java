package com.acharya.generic;
class Data{
	private int str;

	public Data(int str) {
		super();
		this.str = str;
	}

	public int getStr() {
		return str;
	}
	
}

public class Generic1 {

	public static void main(String[] args) {
		Data obj = new Data(1);
		System.out.println(obj.getStr());

	}

}
//Output: 1