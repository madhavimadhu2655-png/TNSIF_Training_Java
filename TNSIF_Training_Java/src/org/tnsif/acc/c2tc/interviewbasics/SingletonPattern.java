package org.tnsif.acc.c2tc.interviewbasics;

class Singleton{
	private static Singleton instance;
	private Singleton() {
		System.out.println("Object created");
	}
	public static Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
	public void display(){
		System.out.println("Hello from singleton class");
	}
}

public class SingletonPattern {

	public static void main(String[] args) {
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		obj1.display();
		if(obj1==obj2) {
			System.out.println("Objects are same");
		}else {
			System.out.println("Objects are different");
		}
	}

}
