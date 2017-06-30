package com.org.devops;


import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemoInJava {

	public static void main(String[] args) {
		
		CollectionsDemoInJava collectionsDemoInJava = new CollectionsDemoInJava();
		//collectionsDemoInJava.understandListAsACollection();
		//collectionsDemoInJava.understandingSetsAsACollecyion();
		
		//collectionsDemoInJava.understandingMapsAsACollection();
		collectionsDemoInJava.understandingMapsAsACollectionForEmployee();
		
	}
	
	public void understandListAsACollection() {
		
		List<String> fruitsList = new ArrayList<String>();
		fruitsList.add("Apples");
		fruitsList.add("Bananas");
		fruitsList.add("Oranges");
		fruitsList.add("Kiwis");
		fruitsList.add("Coconuts");
		
		
		System.out.println("Old Fruits List :: "+fruitsList);
		fruitsList.remove("Oranges");
		fruitsList.add("xyz");
		System.out.println("New Fruits List :: "+fruitsList);
		System.out.println("Third Element in the List is :: "+fruitsList.get(3));
		
		// Arrays Vs List
		
		//Modification In List is Easy as compared with Arrays
		//List is Dynamic whereas Arrays are static
		//Traversing/Retrieving out values in List is easy as compared to Arrays
		//We need to define the Size of Arrays before using it. Not with List.
		
	}

	public void understandingSetsAsACollecyion() {
		Set<String> fruitsSet = new HashSet<String>();
		fruitsSet.add("Apples");
		fruitsSet.add("Bananas");
		fruitsSet.add("Oranges");
		fruitsSet.add("Kiwis");
		fruitsSet.add("Coconuts");
		
		System.out.println("My Initial Fruit Set is :: "+fruitsSet);
		
		fruitsSet.add("Oranges");
		fruitsSet.add("Oranges123");
		
		System.out.println("Checking whether Oranges got added or not :: "+fruitsSet );
	}
	

	public void understandingMapsAsACollection() {
		
		Map<String, String> myMap = new HashMap<String, String>();
		
		myMap.put("101", "Deepanshu");
		myMap.put("101", "Chopra");
		myMap.put("102", "Sathvik");
		myMap.put("103", "Vikram");
		myMap.put("104", "James");
		myMap.put("104", "James");
		
		System.out.println(" I have added a Student Repository and it's values are: "+myMap);
		
		System.out.println("I want to get details of Student ID: 102 -- "+myMap.get("102"));
		
		// Map Contains only Key and Value Pairs
		// In order to get information , you need to provide the key to it.
		// Map Contains only 1 Null value but not more than one.
		// Map doesnot support duplicacy.
		
	}

	public void understandingMapsAsACollectionForEmployee() {
		
		Map<String, Employee> myMap = new HashMap<String, Employee>();
		
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Deepanshu");
		emp.setSalary(10000);
		emp.setLocation("Delhi");
		
		
		myMap.put("101", emp);
		
		
		System.out.println("Displaying information for employee 101 : "+myMap.get("101").getId());
		System.out.println("Displaying information for employee 101 : "+myMap.get("101").getName());
		System.out.println("Displaying information for employee 101 : "+myMap.get("101").getSalary());
		System.out.println("Displaying information for employee 101 : "+myMap.get("101").getLocation());
		
		
		
		
	}

	
}
