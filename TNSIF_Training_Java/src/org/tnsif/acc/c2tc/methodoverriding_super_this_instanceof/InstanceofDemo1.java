package org.tnsif.acc.c2tc.methodoverriding_super_this_instanceof;

class Person5
{
	
}
class Employee extends Person5
{
	
}
class Manager extends Employee
{
	
}

public class InstanceofDemo1 {

	public static void main(String[] args) {
		Person5 person=new Person5();
		Employee emp=new Employee();
		Manager manager=new Manager();
		System.out.println(emp instanceof Employee);//t
		System.out.println(emp instanceof Person5);//t
		System.out.println(emp instanceof Manager);//f
		System.out.println(manager instanceof Manager);//t
		System.out.println(manager instanceof Employee);//t
		System.out.println(manager instanceof Person5);//t
		System.out.println(person instanceof Employee);//f
		System.out.println(person instanceof Manager);//f
		

	}

}