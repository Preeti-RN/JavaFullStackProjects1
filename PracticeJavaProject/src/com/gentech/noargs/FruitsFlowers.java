package com.gentech.noargs;

/*
 fruit name is:apple
shop name:Vinayak
quantity:20
price:200
+++++++++++
flower name:Lotus
shop name:Ganesh
quantity:15
price :150
+++++++++++
vegitable names:ladyfinger
shop nae:big bajar
quantity:12
price :50

 */
class Fruits
{
	String fruitname;
	int quantity;
	String shopname;
	int price;
	Fruits()
	{
		fruitname="apple";
		price=200;
		shopname="Vinayak";
		quantity=20;
		System.out.println("fruit name is:"+fruitname);
		System.out.println("shop name:"+shopname);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
		System.out.println("+++++++++++");
	}
}
class Flowers
{
	String flowername;
	int quantity;
	int price;
	String shopname;
	Flowers()

	{
    flowername="Lotus";
	price=150;
	shopname="Ganesh";
	quantity=15;
	System.out.println("flower name:"+flowername);
	System.out.println("shop name:"+shopname);
	System.out.println("quantity:"+quantity);
	System.out.println("price :"+price);
	System.out.println("+++++++++++");
	}
}
class Vegtables
{
	String vegtablename;
	int quantity;
	int price;
	String shopname;
	Vegtables(){
		vegtablename="ladyfinger";
		price=50;
		shopname="big bajar";
		quantity=12;
		System.out.println("vegitable names:"+vegtablename);
		System.out.println("shop nae:"+shopname);
		System.out.println("quantity:"+quantity);
		System.out.println("price :"+price);

	}
}
public class FruitsFlowers {

	public static void main(String[] args) {
		Fruits fruit=new Fruits();
		
		Flowers flower=new Flowers();
		
		Vegtables veg=new Vegtables();
		

	}

}
