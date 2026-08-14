package org.tnsif.acc.c2tc.scannerclass_bufferreader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class IOExceptionDemo {

	public static void main(String[] args) throws IOException {
		try {
			
			BufferedReader br=new BufferedReader(new FileReader ("C:\\Users\\madha\\OneDrive\\Desktop\\GATE EXAM SYLLABUSs.txt"));
			String data="";
			while((data=br.readLine())!=null)
		{
				System.out.println(data);
		}
		}
		catch(Exception e)
		{
				System.out.println(e);
		}
}

}