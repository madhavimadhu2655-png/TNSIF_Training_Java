package org.tnsif.acc.c2tc.markerinterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Registration s=new Student(121,"Madhavi",12000.00,"Java Fullstack");
		Registration s1=new Student(122,"Sushma",23000.00,"AI&ML");
		Object obj=new Object();
		if(s instanceof Registration) {
			System.out.println("Student is registered to course");
		}
		else {
			System.out.println("Student is not registered");
		}
		
		if(obj instanceof Registration) {
			System.out.println("Student is registered to course");
		}
		
		else {
			System.out.println("Student is not registerd");
		}

	}

}
