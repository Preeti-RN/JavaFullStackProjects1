package com.gentech.polymorphismdemo;
abstract class function
{
	abstract void plus();
}
class addition extends function
{
	void plus()
	{
		int a=2;
		int b=4;
		int add=a+b;
		System.out.println("+ can be used to add two integer as:a+b="+add);
	}
}
class adddouble extends function
{
	void plus()
	{
		double a=2.0;
		double b=3.2;
		double add=a+b;
		System.out.println("+ can be used to add two double values as:a+b="+add);
	}
}
class Stringconcat extends function
{
	void plus()
	{
		String a="Preeti";
		String b="Namagond";
		String concat=a+b;
		System.out.println("+ can be used to add two sring values  as:a+b="+concat);
	}
}
public class FunctionOfPlus {

	public static void main(String[] args) {
		function f=null;
		
		addition ai= new addition();
		adddouble ad=new adddouble();
		Stringconcat concat=new Stringconcat();
		
		f=ai;
		f.plus();
		
		f=ad;
		f.plus();
		
		f=concat;
		f.plus();

	}

}
