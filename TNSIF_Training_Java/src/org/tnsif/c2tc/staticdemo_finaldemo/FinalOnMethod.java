package org.tnsif.c2tc.staticdemo_finaldemo;

class Bank
{
	final void security_Rule()
	{
		System.out.println(" Follow kyc and OTP verification");
	}
}
class SBI extends Bank
{
	void securit_Rule()
	{
		System.out.println("No need of kyc , just otp");
	}
}
public class FinalOnMethod {

	public static void main(String[] args) {
		SBI sbi=new SBI ();
		sbi.security_Rule();

	}

}