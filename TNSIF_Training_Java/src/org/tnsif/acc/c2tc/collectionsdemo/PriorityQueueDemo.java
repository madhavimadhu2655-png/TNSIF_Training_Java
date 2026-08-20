package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // add() - adds elements
        queue.add(30);
        queue.add(10);
        queue.add(40);
        queue.add(20);

        System.out.println("Priority Queue: " + queue);

        // peek() - accesses highest priority element
        System.out.println("Highest priority: " + queue.peek());

        // contains() - checks element
        System.out.println("Contains 30: " + queue.contains(30));

        // size() - number of elements
        System.out.println("Size: " + queue.size());

        // poll() - removes highest priority element
        System.out.println("Removed element: " + queue.poll());

        System.out.println("Queue after poll: " + queue);

        // poll() again
        System.out.println("Removed element: " + queue.poll());

        System.out.println("Queue after poll: " + queue);

        // isEmpty()
        System.out.println("Is queue empty: " + queue.isEmpty());
        
     // poll() again
        System.out.println("Removed element: " + queue.poll());

        System.out.println("Queue after poll: " + queue);

        // clear()
        queue.clear();

        System.out.println("Queue after clear: " + queue);
    }
}