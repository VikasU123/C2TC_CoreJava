package com.acharya.collectionssetinterface;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {

	public static void main(String[] args) {
		SortedSet obj = new TreeSet();
		obj.add(45);
		obj.add(1);
		obj.add(34);
		System.out.println(obj);

	}

}
//Output: [1, 34, 45]