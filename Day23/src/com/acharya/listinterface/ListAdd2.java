package com.acharya.listinterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListAdd2 {

	public static void main(String[] args) {
		List<Integer> val = new ArrayList<>();
		val.add(0);
		val.add(11);
		val.add(23);
		Iterator z = val.iterator();
		while(z.hasNext()) {
			System.out.println(z.next());
		}
		System.out.println("ArrayList : "+ val);

	}

}
/*Output: 0
11
23
ArrayList : [0, 11, 23]
*/