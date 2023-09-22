package com.gentech.constructoroverloading;
/*
order id :13
customer name :Roopali
total amount :470.0
 */

class Orders
{
	Orders(int order_id)
	{
		System.out.println("order id :"+order_id);
	}

	Orders(String customer_name)
	{
		System.out.println("customer name :"+customer_name);
	}
	Orders(double totalamount)
	{
		System.out.println("total amount :"+totalamount);
	}
}

public class OrdersConstructor {
	public static void main(String[] args) {
		Orders p1=new Orders(13);
		Orders p2=new Orders("Roopali");
		Orders o3=new Orders(470.00);

	}
}
