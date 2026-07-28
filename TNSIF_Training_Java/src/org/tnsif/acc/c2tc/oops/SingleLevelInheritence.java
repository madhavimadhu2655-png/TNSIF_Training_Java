package org.tnsif.acc.c2tc.oops;

class Course{
	String courseName="Java Programming";
	void showCourse() {
		System.out.println("course name: " +courseName);
		
	}
}
class Student extends Course{
	String studentName="Madhavi";
	void showStudent() {
		System.out.println("Student Name: " +studentName);
	}
}





public class SingleLevelInheritence {

	public static void main(String[] args) {
		Student s=new Student();
		s.showStudent();
		s.showCourse();

	}

}
