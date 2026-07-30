package org.tnsif.acc.c2tc.methodoverriding_super_this_instanceof;

class Payment1{
	void process() {
		System.out.println("Processing payment using standard gateway");
	}
}

class Gpay extends Payment1{
	void process() {
		System.out.println("Processing payment using via Google Pay");
		
	}
	void completeTransaction() {
		super.process();
		process();
	}
}

public class SuperWithMethod {

	public static void main(String[] args) {
		Gpay obj=new Gpay();
		obj.completeTransaction();

	}

}
