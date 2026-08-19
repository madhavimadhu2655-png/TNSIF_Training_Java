package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.List;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
	    List<Integer> numbers=new Vector<>();
	    
	    numbers.add(10);
	    numbers.add(20);
	    numbers.add(30);
	    numbers.add(40);
	    
	    //access the elements
	    System.out.println("First number "+ numbers.get(0));
	    
	    //modify an element
	    numbers.set(1,25);
	    System.out.println(numbers);
	    
	    //remove the element
	    numbers.remove(3);
	    System.out.println(numbers);
	    
	    //check if exits
	    if(numbers.contains(10))
	    {
	    	System.out.println("10 is present");
	    }
	    else
	    {
	    	System.out.println("10 is not present");
	    }
         
	 // Using Iterable to traverse
        Iterable<Integer> iterableFruits = numbers;

        System.out.println("Traversing using Iterable: "+ iterableFruits);

	    
	    //using for-each to traversal
	    for(Integer num  :numbers)
	    {
	    	System.out.println(num);
	    }
	    
	    //size
	    System.out.println("Size of vector data: " + numbers.size());
	    
	    //to remove all data
	    numbers.clear();
	    System.out.println("List after clear operation: " + numbers);
	}
	
	

}