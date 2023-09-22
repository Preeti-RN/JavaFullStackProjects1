package com.gentech.classes;
/*
apple
Vinayak
20
200
+++++++++++
Lotus
Ganesh
15
150
+++++++++++
ladyfinger
big bajar
12
50

 */
class Fruits
{
	String fruitname;
	int quantity;
	String shopname;
	int price;
}
class Flowers
{
	String flowername;
	int quantity;
	int price;
	String shopname;
}
class Vegtables
{
	String vegtablename;
	int quantity;
	int price;
	String shopname;
}
public class FruitFlowerVeg {

	public static void main(String[] args) {
		Fruits fruit=new Fruits();
		fruit.fruitname="apple";
		fruit.price=200;
		fruit.shopname="Vinayak";
		fruit.quantity=20;
		System.out.println(fruit.fruitname);
		System.out.println(fruit.shopname);
		System.out.println(fruit.quantity);
		System.out.println(fruit.price);
		System.out.println("+++++++++++");
		Flowers flower=new Flowers();
		flower.flowername="Lotus";
		flower.price=150;
		flower.shopname="Ganesh";
		flower.quantity=15;
		System.out.println(flower.flowername);
		System.out.println(flower.shopname);
		System.out.println(flower.quantity);
		System.out.println(flower.price);
		System.out.println("+++++++++++");
		Vegtables veg=new Vegtables();
		veg.vegtablename="ladyfinger";
		veg.price=50;
		veg.shopname="big bajar";
		veg.quantity=12;
		System.out.println(veg.vegtablename);
		System.out.println(veg.shopname);
		System.out.println(veg.quantity);
		System.out.println(veg.price);

	}

}
