package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Dragon Fruit");
        
		System.out.println(fruits);
		System.out.println("Second Fruit :"+fruits.get(1));
		fruits.set(1, "Cherry");
		fruits.remove(2);
		
		if(fruits.contains("Mango"));
		{
			System.out.println(" Mango is in the list");
		}
		for(String fruit:fruits)
		{
			System.out.println(fruits);
		}
	}

}