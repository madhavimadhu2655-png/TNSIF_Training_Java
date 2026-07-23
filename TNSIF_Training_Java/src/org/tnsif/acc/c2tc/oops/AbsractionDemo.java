package org.tnsif.acc.c2tc.oops;

abstract class Arun
{
	void calling() {
		System.out.println("Implemented the calling feature");
	}
	abstract void aiintegration();
	abstract void healthmonitoring();
	abstract void satellitecommit();

}
abstract class Shiva extends Arun{
	void aiintegration() {
		System.out.println("Implemented the Ai integrated feature");
	}
	abstract void healthmonitoring();
	abstract void satellitecommit();
}
class Madhavi extends Shiva{

	@Override
	void healthmonitoring() {
		System.out.println("Implemented the new feature of healthmonitoring");
		
		
	}

	@Override
	void satellitecommit() {
		System.out.println("Implemented the new feature of satelllite commit");
		
	}
}
public class AbsractionDemo {

	public static void main(String[] args) {
		Madhavi m=new Madhavi();
		m.calling();
		m.aiintegration();
		m.satellitecommit();
		m.healthmonitoring();

	}

}
