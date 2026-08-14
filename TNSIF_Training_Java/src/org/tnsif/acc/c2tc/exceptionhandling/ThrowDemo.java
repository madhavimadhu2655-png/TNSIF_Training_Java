package org.tnsif.acc.c2tc.exceptionhandling;

public class ThrowDemo {

	public static void main(String[] args) {
		int age=15;
		
		if(age<18)
		{
			throw new ArithmeticException("You are not eligible to vote");
		}
		else
		{
			System.out.println("You are eligible to vote");
		}
		System.out.println("Hello");
	}

}