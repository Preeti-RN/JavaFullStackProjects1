package com.gentech.abstractdemo;
abstract class animal
{
	abstract void showanimalname(String animalname);

	abstract void displayfruit(String fruitname);
}
class forest extends animal
{
	void showanimalname(String animalname) 
	{
		System.out.println("animal name parent class is:"+animalname);
	}
	void displayfruit(String fruitname)
	{
		System.out.println("fruit name in first child class is:"+fruitname);
	}
}
class fruit extends forest
{
	void displayfruit(String fruitname)
	{
		System.out.println("fruit name in second child class is:"+fruitname);
	}
}
public class MultilevelAbstractMethod {

	public static void main(String[] args) {
		fruit o=new fruit();
		o.displayfruit("Apple");
		forest o1=new forest();
		o.displayfruit("Mango");
		o.showanimalname("Lion");


	}

}
