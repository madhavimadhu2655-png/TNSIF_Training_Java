package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<>();
		set.add("cherry");
		set.add("banana");
		set.add("apple");
		set.add(null);
		set.add(null);
		System.out.println("Linkedhashset "+set);
	}

}