package org.tnsif.acc.c2tc.generics;

import java.util.Arrays;
import java.util.List;

class Animal8
{
	public void makeSound()
	{
		System.out.println("some sound");
	}
}
class Dog8 extends Animal8
{
	public void makeSound()
	{
		System.out.println("bark");
	}
}
class Cat8 extends Animal8
{
	public void makeSound()
	{
		System.out.println("Meow");
	}
}


public class UpperBounded {
										//animals=cats
	public static void printAnimals(List<? extends Animal8> animals)
	{
		for(Animal8 animal:animals)
		{
			animal.makeSound();
		}
	}
	
	public static void main(String[] args) {
		List<Dog8> dogs= Arrays.asList(new Dog8()); 
		List<Cat8> cats= Arrays.asList(new Cat8());
		
		printAnimals(dogs); //bark
		printAnimals(cats); //meow

	}

}