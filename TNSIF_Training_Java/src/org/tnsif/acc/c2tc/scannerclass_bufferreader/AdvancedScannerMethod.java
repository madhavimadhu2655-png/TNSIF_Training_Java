package org.tnsif.acc.c2tc.scannerclass_bufferreader;
import java.util.Scanner;
public class AdvancedScannerMethod {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter some data(you can numbers or text)");
		
		while(scan.hasNext())
		{
			if(scan.hasNextInt())
			{
				 int intValue=scan.nextInt();
				 System.out.println("Read integer : " + intValue);
				 scan.nextLine();
			}
			else if(scan.hasNextDouble())
			{
				double doubleValue =scan.nextDouble();
				System.out.println("Read a double "+doubleValue);
				scan.nextLine();
			}
			else
			{
				String stringvalue =scan.next();
				System.out.println("Unkown input");
			}
		}
       scan.close();
	}

}