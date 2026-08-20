package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.List;
import java.util.Vector;

public class Vector2 {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> numbers = new Vector<>();

        // Thread 1 → Adding elements
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i < 5; i++) {
                numbers.add(i);
                System.out.println("Thread 1 added " + i);
            }
        });

        // Thread 2 → Removing elements
        Thread thread2 = new Thread(() -> {
            for (int i = 1; i < 5; i++) {
                if (!numbers.isEmpty()) {
                    System.out.println("Thread 2 removed " + numbers.remove(0));
                }
            }
        });

        // Start thread1 first
        thread1.start();
        thread1.join(); // wait until thread1 completes

        // Then start thread2
        thread2.start();
        thread2.join(); // wait until thread2 completes
    }
}