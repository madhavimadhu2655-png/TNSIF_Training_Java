package org.tnsif.acc.c2tc.methodoverriding;


class Payment{
	void makePayment() {
		System.out.println("Processing payment using generic method");
	}
}

class UpiPayment extends Payment{
	void makePayment() {
		System.out.println("Processing payment using Upi like paytm,Phnpay");
	}
}

class CardPayment extends Payment{
	void makePayment() {
		System.out.println("Processing Payment using debit/credit card");
	}
}

class WalletPayment extends Payment{
	void makePayment() {
		System.out.println("Processing payment using money");
	}
}
public class PaymentTest {

	public static void main(String[] args) {
		Payment payment;
		payment=new UpiPayment();
		payment.makePayment();
		payment=new CardPayment();
		payment.makePayment();
		payment=new WalletPayment();
		payment.makePayment();
		

	}

}
