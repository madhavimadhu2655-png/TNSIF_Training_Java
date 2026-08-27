package org.tnsif.acc.c2tc.staticdemo_finaldemo;

final class AadharGenerator
{
	void generateId()
	{
		System.out.println("Generated aadhar ID");
	}
}
//class Myaadhar extends  AadharGenerator
//{
//	
//}
public class FinalOnClass {

	public static void main(String[] args) {
		AadharGenerator aadhar=new AadharGenerator();
		aadhar.generateId();

	}

}