package org.tnsif.acc.c2tc.exceptionhandling;

public class ArithmeticExceptions{

	public static void main(String[] args) {
		int number1=50/5;
		System.out.println(number1); //10
		int number2=50/10; //5
		System.out.println(number2);
		try {
			int number3=50/0;
			System.out.println(number3);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		int number4=50/25;
		System.out.println(number4);

	}

}