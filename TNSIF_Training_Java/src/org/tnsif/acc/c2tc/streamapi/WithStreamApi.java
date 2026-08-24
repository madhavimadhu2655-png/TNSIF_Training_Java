package org.tnsif.acc.c2tc.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class WithStreamApi {
public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,3,4,5,6,7,8,9);
		List <Integer> result = numbers.stream() //create stream from the list
				.filter(n->n%2==0)
				.map(n->n*2)
				.sorted()
				.collect(Collectors.toList());
	  System.out.println(result);
}
}