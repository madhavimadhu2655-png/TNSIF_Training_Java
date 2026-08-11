package org.tnsif.acc.c2tc.interfacedemo;
@FunctionalInterface
interface NotificationService{
	void notifyUser(String message);
}

class EmailNotification implements NotificationService{

	@Override
	public void notifyUser(String message) {
		System.out.println("EmailNotification : " +message);
		
	}
	
}

class SMSNotification implements NotificationService{

	@Override
	public void notifyUser(String message) {
		System.out.println("Sending message: " +message);
		
	}
	
}


public class FunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotificationService email=new EmailNotification();
		email.notifyUser("Meeting at 10am");
		
		NotificationService sms=new SMSNotification();
		sms.notifyUser("Assignment upload");

	}

}
