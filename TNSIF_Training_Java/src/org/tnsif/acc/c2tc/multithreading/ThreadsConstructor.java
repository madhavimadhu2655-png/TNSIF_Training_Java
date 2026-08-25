package org.tnsif.acc.c2tc.multithreading;

class MyRunnable implements Runnable
{
	public void run() {
		System.out.println(Thread.currentThread().getName() + "is running");
		}
	
}
public class ThreadsConstructor {
public static void main(String[] args) {
		Thread thread1 =new Thread(); //Thread()
		thread1.setName("Thread 1");
		thread1.start();
		System.out.println("Thread name :" + thread1.getName());
		
		Thread thread2 = new Thread("Thread 2");//Thread(String name)
		thread2.start();
		System.out.println("Thread name : " + thread2.getName());
		
		
		MyRunnable myRunnable=new MyRunnable();//Thread(Runnable r)
		Thread thread3 =new Thread( myRunnable);
		thread3.start();
		
		Thread thread4=new Thread(myRunnable,"Thread 4");//Thread(Runnable r, String name)
		thread4.start();
		
	}


}