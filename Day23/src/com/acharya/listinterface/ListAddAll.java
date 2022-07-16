//addAll method
package com.acharya.listinterface;

import java.util.ArrayList;
import java.util.List;

public class ListAddAll {

	public static void main(String[] args) {
		List<String> val1 = new ArrayList<>();
		val1.add("corona be stopped");
		List<String> val2 = new ArrayList<>();
		val2.add("stay at home");
		val1.addAll(val2);
		System.out.println(val1);

	}

}
//Output: [corona be stopped, stay at home]