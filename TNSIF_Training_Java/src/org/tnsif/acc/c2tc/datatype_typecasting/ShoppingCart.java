package org.tnsif.acc.c2tc.datatype_typecasting;

public class ShoppingCart {

	public static void main(String[] args) {
		//Shopping Cart
		
		//widening (small -large)
		int quantity=3;
		double pricePerItem=99.50;
		double totalPrice=quantity*pricePerItem;
		
		//narrowing (large-small)
		double discount=10.75;
		int roundedDiscount=(int)discount;
		
		double finalAmount=totalPrice-roundedDiscount;
		
		
		System.out.println("Online Shopping Summary");
		System.out.println("items Bought "+quantity);
		System.out.println("Price per item "+pricePerItem);
		System.out.println("Final Amount to pay after discount :"+finalAmount);

	}

}