//Contains method
package com.acharya.listinterface;

import java.util.ArrayList;
import java.util.List;

public class ListContains {

	public static void main(String[] args) {
		List<String> var = new ArrayList<>();
		var.add("pen");
		var.add("Pencil");
		var.add("eraser");
		System.out.println("List "+var);
		boolean res = var.contains("Pencil");
		System.out.println("Is pencil present in the list : "+res);

	}

}
/*Output: List [pen, Pencil, eraser]
Is pencil present in the list : true
*/