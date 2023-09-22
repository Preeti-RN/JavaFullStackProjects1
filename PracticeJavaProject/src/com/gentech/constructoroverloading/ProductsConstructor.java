package com.gentech.constructoroverloading;
/*
 product_id :3
price :43000.0
Product Name :Laptop

 */
class Products
{
	Products(int product_id)
	{
		System.out.println("product_id :"+product_id);
	}
	Products(double price)
	{
		System.out.println("price :"+price);
	}
	Products(String product_name)
	{
		System.out.println("Product Name :"+product_name);
	}
}

public class ProductsConstructor {

	public static void main(String[] args) 
	{
		Products p1=new Products(3);
		Products p2=new Products(43000.00);
		Products p3=new Products("Laptop");


	}

}
