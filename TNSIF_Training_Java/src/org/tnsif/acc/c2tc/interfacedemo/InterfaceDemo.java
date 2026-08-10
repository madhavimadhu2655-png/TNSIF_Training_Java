package org.tnsif.acc.c2tc.interfacedemo;

class SmartLight implements SmartDevice{

	@Override
	public void turnOn() {
		System.out.println("Smart light is on");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Smart light is off");
		
	}

	@Override
	public void getStatus() {
		// TODO Auto-generated method stub
		System.out.println("Smart light is on standby mode");
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartLight s=new SmartLight();
		s.turnOn();
		s.turnOff();
		s.getStatus();
		

	}

}
