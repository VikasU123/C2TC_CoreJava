package com.acharya.listinterface;

import java.util.ArrayList;
import java.util.Collections;

public class ListShuffle {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("c");
		list.add("Python");
		list.add(".net");
		list.add("Compiler");
		Collections.shuffle(list);
		System.out.println("Results after shuffle operation : "+list);
		Collections.shuffle(list);
		System.out.println("Results after shuffle operation: "+list);

	}

}
/*Output: Results after shuffle operation : [Python, c, .net, Compiler]
Results after shuffle operation: [Python, Compiler, .net, c]
*/