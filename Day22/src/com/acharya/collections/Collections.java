//Collection Framework
package com.acharya.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collections {

	public static void main(String[] args) {
		Collection list = new ArrayList();
		list.add(100);
		list.add(10);
		list.add(1000);
		list.add("Webinar");
		System.out.println("ArrayList : "+list);

	}

}
//Output: ArrayList : [100, 10, 1000, Webinar]