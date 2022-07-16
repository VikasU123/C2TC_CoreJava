//HashSet
package com.acharya.collectionssetinterface;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		Set obj = new HashSet();
		obj.add("Technolgy");
		obj.add("practice");
		obj.add("Java");
		obj.add(4.56);
		obj.add(1);
		System.out.println(obj);

	}

}
//Output: [Java, 1, practice, 4.56, Technolgy]