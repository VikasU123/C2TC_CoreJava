//Clear method
package com.acharya.listinterface;

import java.util.ArrayList;
import java.util.List;

public class ListClear {
	public static void main(String[] arg) {
		List<String> val = new ArrayList<>();
		val.add("java");
		val.add("is");
		val.add("Interesting");
		System.out.println("Becfore clear : "+val);
		val.clear();
		System.out.println("After clean : "+val);
	}

}
/*Output: Becfore clear : [java, is, Interesting]
After clean : []
*/