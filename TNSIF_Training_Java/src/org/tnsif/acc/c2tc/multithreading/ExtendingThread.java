package org.tnsif.acc.c2tc.multithreading;


class Eclipse extends Thread
{
	public void run()
	{
		System.out.println("Eclipse id" + "  " + Thread.currentThread().getId());
	}
}

class OneNote extends Thread
{
	public void run()
	{
		System.out.println("OneNote id" + "  " + Thread.currentThread().getId());
	}
}
class Chrome extends Thread
{
	public void run()
	{
		System.out.println("chrome id" + "  " + Thread.currentThread().getId());
	} 
}


public class ExtendingThread {

	public static void main(String[] args) {
		Eclipse obj=new Eclipse();
		obj.start();
//		OneNote obj1=new OneNote();
//		obj1.start();
//		Chrome obj2 =new Chrome();
//		obj2.start();
		for (int i=0;i<5;i++) {
		System.out.println("Main method thread id is " + "  " + Thread.currentThread().getId());
		
	}

}
}