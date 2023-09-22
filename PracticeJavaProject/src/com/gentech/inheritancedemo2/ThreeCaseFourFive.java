package com.gentech.inheritancedemo2;
class College
{
	String name;
	void showClgname(String name)
	{
		System.out.println("the college name in parent class:"+name);
	}
}
class College2 extends College
{
	College2(String name)
	{
		super.name=name;
		super.showClgname(name);
	}
	String name;
	void showClgname(String name)
	{
		System.out.println("the college name in child class:"+name);
	}
}
class College3 extends College2
{
	College3(String name)
	{
		super(name);
		super.showClgname(name);	

	}
	String name;
	void showClgname(String name)
	{
		System.out.println("the college name in child class:"+name);
	}
}


public class ThreeCaseFourFive {

	public static void main(String[] args) {
		College3 o=new College3("PDA");
		o.showClgname("Shetty Collge");
		o.showClgname("Appa College");
		o.showClgname("R.V College");
		


	}

}
