package com.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<Object>();
		
		list.add(1);
		
		
		list.add("Ram");
		list.add("Shyam");
		list.add("Mohan");
		list.add("Raghav");
		list.add(true);
		
		System.out.println(list);

	}
	
}
