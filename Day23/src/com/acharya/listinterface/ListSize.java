//Size method
package com.acharya.listinterface;

import java.util.ArrayList;

public class ListSize {

	public static void main(String[] args) {
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(15);
		arrlist.add(20);
		arrlist.add(25);
		arrlist.add(22);
		int value = arrlist.size();
		System.out.println(value);

	}

}
//Output: 4