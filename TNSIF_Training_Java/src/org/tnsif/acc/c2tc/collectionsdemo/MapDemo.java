package org.tnsif.acc.c2tc.collectionsdemo;


import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		map.put(1, 100);
		map.put(2, 200);
		map.put(3, 500);
		map.put(4, 400);
		
		
		System.out.println("Intial map "+ map);
		
		 int valueForKey1= map.get(1);
		 System.out.println("Value of key 1 :"+valueForKey1);
		 
		 map.put(2, 250);
		 System.out.println("Map after updating value for key '2' "+map);
		 
		 map.remove(3);
		 System.out.println("Map after removing key '3' "+map);
		 
		  boolean haskey1 =   map.containsKey(1);
		  System.out.println("Map contains key '1' "+haskey1);
		  
		  boolean hasValue400= map.containsValue(400);
		  System.out.println("Map contains value 400 "+hasValue400);
		  
		  
	      int size =  map.size();
	      System.out.println("Size of the map :"+size);

	      map.clear();
	      System.out.println("After clear opr " +map);
	}

}