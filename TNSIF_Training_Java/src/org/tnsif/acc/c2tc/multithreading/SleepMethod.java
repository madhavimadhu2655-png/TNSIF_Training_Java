package org.tnsif.acc.c2tc.multithreading;

class Sleep extends Thread
{
	public void run()
	{
		for (int i=0;i<5;i++)
		{
			System.out.println("sleep id" + "  " + Thread.currentThread().getId());
			try
			{
				sleep(2000); //1 sec
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

public class SleepMethod 
{

	public static void main(String[] args) {
		Sleep obj=new Sleep ();
		obj.start();
	}

}