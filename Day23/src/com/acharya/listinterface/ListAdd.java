package com.acharya.listinterface;

import java.util.ArrayList;
import java.util.List;

public class ListAdd {

	public static void main(String[] args) {
		List<Integer> val = new ArrayList<>();
		val.add(0);
		val.add(11);
		val.add(23);
		val.add(34);
		for(Integer e : val) {
			System.out.print(e);
		}
		System.out.println();
		System.out.println("ArrayList : "+ val);

	}

}
/*Output: 0112334
ArrayList : [0, 11, 23, 34]
*/