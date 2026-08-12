package org.tnsif.acc.c2tc.interfacedemo;

interface Vehicle
{
	public abstract void start();
	public abstract void stop();
	final static int Max_speed=120;
	
	default void repair()
	{
		System.out.println("Vehicle repair is done here");
	}
	
	static void checkMaintaince()
	{
		System.out.println("Vehicle maintaince taken care here");
	}
}

class Car implements Vehicle
{
    private  String model;
    
    Car(String model)
    {
       this.model=model;
    }
	
	
	@Override
	public void start() {
		System.out.println("Car "+ model +" starting");
		
		
	}

	@Override
	public void stop() {
		System.out.println("Car "+ model +" stopping");
		
	}
	
}
class Bike implements Vehicle
{

	private String type;
	
	Bike(String type)
	{
		this.type=type;
	}
	@Override
	public void start() {
		System.out.println("Bike "+ type +" starting");
		
	}

	@Override
	public void stop() {
	
		System.out.println("Bike "+ type +" stopping");
	}
	
}

public class Default_StaticDemo {

	public static void main(String[] args) {
		Vehicle car=new Car("Tata Sierro");
		Vehicle bike=new Bike("Royal Enf");
		
		car.start();
		car.stop();
		car.repair();
		System.out.println("-----------");
		
		bike.start();
		bike.stop();
		bike.repair();
		
		System.out.println("-----------");
		
		Vehicle.checkMaintaince();
		
		System.out.println("Maxspeed "+Vehicle.Max_speed);
		
		
	}

}