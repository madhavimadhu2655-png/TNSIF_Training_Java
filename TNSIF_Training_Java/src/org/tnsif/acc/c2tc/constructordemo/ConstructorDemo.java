package org.tnsif.acc.c2tc.constructordemo;

class User1
{
	String name;
	int age;
	
	User1()
	{
		name="Guest";
		age=0;
		System.out.println("Guest profile created");
		System.out.println("Name ->" + name + " "+"Age ->"+ age );
	}
	
	User1(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("User Created :Name ->" + name + " "+"Age ->"+ age );
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		User1 user=new User1();
		User1 use1r=new User1("Hema ",26);

	}

}