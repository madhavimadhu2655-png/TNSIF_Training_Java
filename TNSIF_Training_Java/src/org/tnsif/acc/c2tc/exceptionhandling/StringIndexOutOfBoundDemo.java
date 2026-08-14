package org.tnsif.acc.c2tc.exceptionhandling;

public class StringIndexOutOfBoundDemo {

	public static void main(String[] args) {
		String str="hello";
		try {
			char ch=str.charAt(5);
			System.out.println(ch);
		}catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		

	}

}