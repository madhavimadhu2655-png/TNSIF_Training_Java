package org.tnsif.acc.c2tc.scannerclass_bufferreader;
import java.util.Scanner;
public class ScannerCharDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String ");
		  char ch= scan.next().charAt(3);
		  System.out.println("Fourth charater is "+ch);

	}

}