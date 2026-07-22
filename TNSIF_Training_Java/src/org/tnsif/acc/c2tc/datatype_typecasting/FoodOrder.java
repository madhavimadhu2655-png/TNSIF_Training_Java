package org.tnsif.acc.c2tc.datatype_typecasting;

public class FoodOrder {

	public static void main(String[] args) {
		//Food Delivery system
		
		//Primitive datatype
		
		int      orderId=101;
		double   price=299.99;
		boolean  isDelivered=false;
		char     rating='A';
		float    deliveryDistance=5.3f;
		long     deliveryBoyPhone=9864629292L;
		byte     deliveryTime=45;
		short    resturtantId=12;
		
		
		//Non Primitive 
		
		String CustomerName="Anjali";
		String[] foodItems= {"Briyanni","Coke","Jamun"};
		
		System.out.println("Order Summary");
		System.out.println("Customer Name :"+CustomerName);
		System.out.println("Order Id :"+orderId);
		System.out.println("RestaurantID :"+resturtantId);
		System.out.println("Delivery Boy Contact :"+deliveryBoyPhone);
		System.out.println("Food items :");
		for (String item : foodItems)
		{
			System.out.println(" - "+ item);
		}
		
		System.out.println("Total Price :"+price);
		System.out.println("DeliveryDistance :"+deliveryDistance);
		System.out.println("Expcted Time :"+deliveryTime);
		System.out.println("Delivery status :"+isDelivered);
		System.out.println("Rating :"+ rating);
		 
		 
		

	}

}