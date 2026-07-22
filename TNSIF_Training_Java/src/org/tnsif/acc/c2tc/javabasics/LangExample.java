package org.tnsif.acc.c2tc.javabasics;

public class LangExample {

	public static void main(String[] args) {
		
		String greeting="Hello Students";
		
		System.out.println("Original String :"+ greeting);
		System.out.println("Uppercase :" +greeting.toUpperCase());
		System.out.println("Lowercase :"+greeting.toLowerCase());
		
		int max=Math.max(10,30);
		double sqrt =Math.sqrt(25.0);
		System.out.println("Max "+max);
		System.out.println("Sqrt "+ sqrt);

	}

}