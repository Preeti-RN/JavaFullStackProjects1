package com.gentech.abstractdemo;
abstract class animal6
{
	abstract void showanimalname(String animalname);

	abstract void displayfruit(String fruitname);
}
class forest6 extends animal6
{
	void showanimalname(String animalname) 
	{
      System.out.println("animal name first child class is:"+animalname);
	}
	void displayfruit(String fruitname)
	{
		System.out.println("fruit name in first child class is:"+fruitname);
	}
}
class vegitable6 extends forest6
{
	void displayfruit(String adress)
	{
		System.out.println("adress in second child class is:"+adress);
	}
}

class person6 extends animal6
{
	void showanimalname(String pname)
	{
		System.out.println("person name is:"+pname);
	}
	void displayfruit(String vegname)
	{
		System.out.println("vegitable name:"+vegname);
	}
}
public class HybridAbstractMethod {

	public static void main(String[] args) {
		person6 o=new person6();
		o.showanimalname("Preeti");
		o.displayfruit("Brinjole");
		vegitable6 o1=new vegitable6();
		o1.displayfruit("Market");
		forest6 o2=new forest6();
		o2.showanimalname("cow");
		o2.displayfruit("Mango");
		
		
		

	}

}
