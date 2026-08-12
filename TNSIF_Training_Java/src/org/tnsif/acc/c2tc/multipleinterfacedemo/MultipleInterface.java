package org.tnsif.acc.c2tc.multipleinterfacedemo;
class SmartPhone implements Camera,MusicPlayer{

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("Play the music");
		
	}

	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		System.out.println("Take a photo");
	}
	
}
public class MultipleInterface {


	public static void main(String[] args) {
		SmartPhone c=new SmartPhone();
		c.takePhoto();
		c.playMusic();
		

	}

}
