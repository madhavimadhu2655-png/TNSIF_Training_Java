package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person6
{
	String name;
	int age;
	
	public Person6(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	 void display()
	 {
		 System.out.println("Name :"+ name + " , Age :"+ age );
	 }

}

class NameComparator implements Comparator<Person6>
{

	@Override
	public int compare(Person6 p1, Person6 p2) {
		
		return p1.name.compareTo(p2.name);
	}
	
}

class AgeComparator implements Comparator<Person6>
{

	@Override
	public int compare(Person6 p1, Person6 p2) {
		
		return Integer.compare(p1.age,p2.age);
	}
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
	
      List<Person6> people =new ArrayList<>();
      people.add(new Person6("Sushma",34));
      people.add(new Person6("Akash",25));
      people.add(new Person6("Hema",26));
      
      Collections.sort(people , new  NameComparator());
      System.out.println("Sorted by name");
      System.out.println();
      
      for(Person6 person:people)
      {
    	  person.display();
      }
      
      System.out.println();
      
      Collections.sort(people , new  AgeComparator());
      System.out.println("Sorted by age");
      System.out.println();
      
      for(Person6 person:people)
      {
    	  person.display();
      }
      
	}

}