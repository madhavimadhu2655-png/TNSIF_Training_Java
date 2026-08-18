package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Dragon");
        
		System.out.println(fruits);
		
		System.out.println("Second Fruit :"+fruits.get(1));
		
		fruits.set(1, "Cherry");
		System.out.println(fruits);
		
		fruits.remove(2);
		System.out.println("After removing "+fruits);
		
		
		if(fruits.contains("Mango"))
		{
			System.out.println("Requested fruit is present");
		}else
		{
			System.out.println("Requested fruit is not prsent");
		}
		
		// Using Iterable
        Iterable<String> iterableFruits = fruits;

        System.out.println("Traversing using Iterable:"+fruits);
        
        //using for-each loop also you can traverse
		for(String fruit:fruits)
		{
			System.out.println("Traversing using for-each loop "+fruit);
		}
	}

}