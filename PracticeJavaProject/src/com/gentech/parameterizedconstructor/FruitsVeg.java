package com.gentech.parameterizedconstructor;
/*
 fruit name is:apple
shop name:vinayak
quantity:20
price:200
+++++++++++
flower name:Lotus
shop name:ganesh
quantity:10
price :30
+++++++++++
vegitable names:ladyfinger
shop nae:big bajar
quantity:15
price :50

 */

class Fruits
{
	
	Fruits(String fruitname,int quantity,String shopname,int price)
	{
		
		System.out.println("fruit name is:"+fruitname);
		System.out.println("shop name:"+shopname);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
		System.out.println("+++++++++++");
	}
}
class Flowers
{
	
	Flowers(String flowername,int quantity,int price,String shopname)

	{
    
	System.out.println("flower name:"+flowername);
	System.out.println("shop name:"+shopname);
	System.out.println("quantity:"+quantity);
	System.out.println("price :"+price);
	System.out.println("+++++++++++");
	}
}
class Vegtables
{
	
	Vegtables(String vegtablename,int quantity,int price,String shopname){
		
		System.out.println("vegitable names:"+vegtablename);
		System.out.println("shop nae:"+shopname);
		System.out.println("quantity:"+quantity);
		System.out.println("price :"+price);

	}
}
public class FruitsVeg {

	public static void main(String[] args) {
        Fruits fruit=new Fruits("apple",20,"vinayak",200);
		
		Flowers flower=new Flowers("Lotus",10,30,"ganesh");
		
		Vegtables veg=new Vegtables("ladyfinger",15,50,"big bajar");

	}

}
