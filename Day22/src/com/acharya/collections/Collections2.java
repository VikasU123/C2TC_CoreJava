package com.acharya.collections;

import java.util.ArrayList;
import java.util.List;

public class Collections2 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(4);
		System.out.println(l);

	}

}
//Output: [1, 2, 3, 4, 5, 6, 4]