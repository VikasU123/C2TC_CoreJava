//rotate method
package com.acharya.listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListRotat {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Practice");
		list.add("code");
		list.add("every");
		list.add("day");
		System.out.println("Original List: "+list);
		Collections.rotate(list,2);
		System.out.println("Rotate List: "+list);

	}

}
/*Output: Original List: [Practice, code, every, day]
Rotate List: [every, day, Practice, code]
*/