package org.tnsif.acc.c2tc.interviewbasics;

public class CountFrequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hi I am Madhavi ";
		str=str.toLowerCase();
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				continue;
			}
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]=' ';
				}
			}
			if(ch[i]!=' ') {
				System.out.println(ch[i]+"="+count);
			}
			
		}
		

	}

}
