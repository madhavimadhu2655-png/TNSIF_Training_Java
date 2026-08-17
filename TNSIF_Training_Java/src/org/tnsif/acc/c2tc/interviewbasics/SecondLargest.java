package org.tnsif.acc.c2tc.interviewbasics;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr= {12,32,43,54,21,22,42};
		int large=Integer.MIN_VALUE;
		int secondLarge=Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>large) {
				secondLarge=large;
				large=num;
			}else if(num>secondLarge&&num!=large) {
				secondLarge=num;
			}
		}
		System.out.println("Secondlarge: "+secondLarge); 
	}

}
