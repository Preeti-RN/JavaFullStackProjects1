package com.gentech.polymorphismdemo;
abstract class differentorgans
{
	abstract void function();
}
class heart extends differentorgans
{
	void function()
	{
		System.out.println("function of organ heart is blood pumping");
	}
}
class brain extends differentorgans
{
	void function()
	{
		System.out.println("function of brain is cognitive activity");
	}
}
class lungs extends differentorgans
{
	void function()
	{
		System.out.println("function of lungs is breathing");
	}
}
public class FiveDiffOrgans {

	public static void main(String[] args) {
		differentorgans f=null;
		
		heart h=new heart();
		brain b=new brain();
		lungs l=new lungs();
		
		f=h;
		f.function();
		
		f=b;
		f.function();
		
		f=l;
		f.function();
		

	}

}
