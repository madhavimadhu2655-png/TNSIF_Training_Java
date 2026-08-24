package org.tnsif.acc.c2tc.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllIntermediateOps {

	public static void main(String[] args) {
		//Initial list of numbers
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,5,6,7,8,9);
		
		//1.map :multiple each number by 2
		List<Integer> doubled =numbers.stream().map(n->n*2).collect(Collectors.toList());
		System.out.println("Doubled "+doubled);
				
		//2 filter : keep only even number
		List<Integer> evens=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("After filter " +evens);
		
		//3 distinct :remove the duplicates
		List<Integer> uniquenumbers=numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("After Distinct " +uniquenumbers);
		
		
		//4 limit(5) :takes only the first 5 element
		List<Integer> limitednumbers=numbers.stream().limit(5).collect(Collectors.toList());
		System.out.println("Limited number "+ limitednumbers);
		
		//5 sorted :sorting the elements(ascending format)
		List<Integer> sorteddata=numbers.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted data "+ sorteddata);
		
		//6 skip(2) : skip first 2 elements
		
		List<Integer> skipped=numbers.stream().skip(2).collect(Collectors.toList());
		System.out.println("Skipped data "+skipped );
	}
	

}