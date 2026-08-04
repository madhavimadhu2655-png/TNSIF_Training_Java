package org.tnsif.acc.c2tc.scannerclass_bufferreader;
import java.util.Scanner;
public class ScannerDemo2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		 String name =  scan.nextLine();
		 
		System.out.println("Enter your age");
		 int age = scan.nextInt();
		 
		 System.out.println("Enter your height");
         float height = scan.nextFloat();
         
         System.out.println("Are a Student");
          boolean is_Student = scan.nextBoolean();
          
          System.out.println("Enter your aadhar");
          long aadhar = scan.nextLong();
          scan.nextLine();
          
          System.out.println("Enter your Favorite teacher");
           String teacher = scan.nextLine();
           
          System.out.println("Enter your Hobby");
           String hobby = scan.nextLine();
           
          System.out.println("Enter your daily reading time in minutes");
            byte readingTime= scan.nextByte();
            
          System.out.println("Enter your CGPA");
            double cgpa=scan.nextDouble();
            
            System.out.println("Enter your siblings");
            short noofsib=scan.nextShort();
            
            System.out.println(" Student information");
    		System.out.println("Name "+name);
    		System.out.println("Age "+age);
    		System.out.println("Height "+height);
    		System.out.println("isstudent "+is_Student);
    		System.out.println("aadhar "+aadhar);
    		System.out.println("Favorite Teacher"+teacher);
    		System.out.println("Hobby "+hobby);
    		System.out.println("Reading time"+readingTime);
    		System.out.println("cgpa "+cgpa);
    		System.out.println("Siblings "+noofsib);
    		
    		scan.close();
	} 

}