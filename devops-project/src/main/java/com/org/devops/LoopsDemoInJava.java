package com.org.devops;


public class LoopsDemoInJava {

	public static void main(String args[]) {
		LoopsDemoInJava loopsDemoInJava = new LoopsDemoInJava();
		//loopsDemoInJava.understandForLoop();
		//loopsDemoInJava.understandNewForLoop();
		loopsDemoInJava.understandWhileLoop();
	}
	
	public void understandForLoop(){
		for(int i=1; i<=10; i++) {
			System.out.println(" My Counter reaches to :: "+i);
		}
	}
	
	public void understandNewForLoop() {
		int[] arr = {1,2,3,4,5};
		System.out.println("The Size of my Array is : "+arr.length);
		for (int i : arr) {
			System.out.println("New For Loop :: "+i);
		}
	}
	
	public void understandWhileLoop() {
		int i = 1;
		while(i < 10) {
			System.out.println("I is now : "+i);
			i++;
		}
	}

	
}
