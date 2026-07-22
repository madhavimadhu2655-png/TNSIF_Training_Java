package org.tnsif.acc.c2tc.jr_developer;

public class KIA_Speedlimit {
	
	 void disp_speedlimit()
	{
		System.out.println("All KIA have SpeedLimit");
	}

	 public static void main(String[] args) {
		 KIA_Airbags bag=new KIA_Airbags();
		 bag.disp_airbags();
		 KIA_Speedlimit bag1=new KIA_Speedlimit();
		 bag1.disp_speedlimit();
		 
		 
}
}