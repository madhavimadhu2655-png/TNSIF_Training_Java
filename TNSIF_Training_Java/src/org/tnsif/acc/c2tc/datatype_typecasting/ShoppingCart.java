package org.tnsif.acc.c2tc.datatype_typecasting;

public class ShoppingCart {

	public static void main(String[] args) {
		//Implicit (smaller-larger)
		
		int quantity=3;
		double pricePerItem=99.50d;
		double total_price=quantity*pricePerItem;  //int->double automatically
		
		double discount=10.75;
		

	}

}