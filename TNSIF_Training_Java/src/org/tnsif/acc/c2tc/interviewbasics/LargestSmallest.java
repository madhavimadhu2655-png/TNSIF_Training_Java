package org.tnsif.acc.c2tc.interviewbasics;

public class LargestSmallest {

	public static void main(String[] args) {
		int[] arr= {12,32,43,54,31,45,67};
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("LargestElement: "+largest);
		System.out.println("SmallestElement: "+smallest);

	}

}
