package org.tnsif.acc.c2tc.oops;

class Device{
	void deviceType() {
		System.out.println("I am an device");
	}
}
class Phone extends Device{
	void brand() {
		System.out.println("Brand : Samsung");
	}
}
class SmartPhone extends Phone{
	void features() {
		System.out.println("TouchScreen,Camera,Internet");
	}
}



public class MultiLevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp=new SmartPhone();
		sp.deviceType();
		sp.brand();
		sp.features();
		

	}

}
