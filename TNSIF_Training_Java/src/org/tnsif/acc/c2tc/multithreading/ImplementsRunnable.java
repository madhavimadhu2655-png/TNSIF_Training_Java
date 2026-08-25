package org.tnsif.acc.c2tc.multithreading;

class Eclipse1 implements Runnable
{
 public void run()
 {
	 for(int i=0;i<5;i++)
	 {
		 System.out.println("Eclipse id" + "  " + Thread.currentThread().getId());
	 }
 }

}
public class ImplementsRunnable {

	public static void main(String[] args) {
		Eclipse1 obj=new Eclipse1();
		Thread obj1=new Thread(obj);
		obj1.start();
		System.out.println("Main id" + "  " + Thread.currentThread().getId());
	}

}