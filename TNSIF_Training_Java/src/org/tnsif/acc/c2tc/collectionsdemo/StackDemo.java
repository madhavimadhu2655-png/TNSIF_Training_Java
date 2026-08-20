package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack.push(10); //top1   //4
		stack.push(20); //top2   //3
		stack.push(30); //top3   //2
		stack.push(40); //top4   //1
		
		System.out.println("Stack after push operation "+stack);
		
		System.out.println("Top element "+stack.peek());
		
		System.out.println("Element popped "+stack.pop());
		
		System.out.println(stack);
		
		stack.clear();
		
		System.out.println(stack);
		
		System.out.println("Is stack empty "+stack.isEmpty());
	
	}

}