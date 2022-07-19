//Put() method
package com.acharya.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class PutMethod {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(95, "Welcome");
		map.put(100, "to");
		map.put(80, "webinar");
		System.out.println(map);

	}

}
//Output: {80=webinar, 100=to, 95=Welcome}