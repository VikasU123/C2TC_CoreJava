package com.acharya.streamapi;

import java.util.Arrays;
import java.util.List;

public class MethodReferencing {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		list.forEach(System.out::println);

	}

}
/*Output:1
2
3
4
5
6*/