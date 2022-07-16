//RemoveAll method
package com.acharya.listinterface;

import java.util.ArrayList;

public class ListRemoveAll {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list2.add(300);
		list2.add(400);
		System.out.println(list1);
		System.out.println(list2);
		list1.remove(list2);
		System.out.println(list1);

	}

}
/*Output: [100, 200, 300]
[300, 400]
[100, 200, 300]
*/