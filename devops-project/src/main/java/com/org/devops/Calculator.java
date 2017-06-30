package com.org.devops;


//This will create a class in Java
public class Calculator {

	//This is a method is Java or we can say, a functionality in Java
	protected void addNumbers(int number1, int number2) {
		int add = number1 + number2;
		System.out.println("Addtion of two numbers is : " + add);
	}
	
	//This is a method is Java or we can say, a functionality in Java
	public void substraction(int number1, int number2) {
		int diff = number1 - number2;
		System.out.println("Differnce of two numbers is :  "+diff);
	}
	
	//This is a method is Java or we can say, a functionality in Java
	public void multiplication(int number1, int number2) {
		int multiple = number1 * number2;
		System.out.println("Multiplication of two numbers is :  "+multiple);
	}

	public void division(int number1, int number2) {
		int division = number1/number2;
		System.out.println("Dvision of two number is : "+division);
	}
	
	// This is a first method from where the Prog will get loaded in Java Memory
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		int number1 = 20;
		int number2 = 10;
		
		calc.addNumbers(number1, number2);
		calc.substraction(number1, number2);
		calc.multiplication(number1, number2);
		calc.division(number1, number2);
	}
}

// As per the request, I have created a new Project in my local system and going to add it on Server Repository.

