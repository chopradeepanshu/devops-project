package com.test;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("101", "A");
		map.put("102", "B");
		map.put("103", "C");
		map.put("104", "A");
		map.put("105", "A+");
		map.put("106", 100);
		map.put("107", 100.464);
		map.put("108", false);
		map.put("101", "A1");

		System.out.println("The complete map is shown below:");
		System.out.println(map);
		System.out.println("I have added something to test this file...");
	}
	
	//Making changes with my prog.
}
